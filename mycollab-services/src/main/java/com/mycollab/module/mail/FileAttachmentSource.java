/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.mail;

import com.mycollab.core.MyCollabException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.EmailAttachment;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author MyCollab Ltd.
 * @since 1.0
 */
public class FileAttachmentSource implements AttachmentSource {
    private File file;
    private String name;

    public FileAttachmentSource(File file) {
        this(null, file);
    }

    public FileAttachmentSource(String name, File file) {
        this.file = file;
        this.name = name;
    }

    public FileAttachmentSource(String name, InputStream inputStream) {
        this.name = name;
        try {
            this.file = File.createTempFile("mycollab", "tmp");
            FileUtils.copyInputStreamToFile(inputStream, file);
        } catch (IOException e) {
            throw new MyCollabException(e);
        }
    }

    @Override
    public EmailAttachment getAttachmentObj() {
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(file.getPath());
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setName((name == null) ? file.getName() : name);
        return attachment;
    }
}
