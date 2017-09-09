/**
 * This file is part of mycollab-localization.
 *
 * mycollab-localization is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-localization is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-localization.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.common.i18n;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;

@BaseName("common-generic")
@LocaleData(value = {@Locale("en-US")}, defaultCharset = "UTF-8")
public enum GenericI18Enum {
    NOTIFICATION_GOTO_FIRST_RECORD,
    NOTIFICATION_GOTO_LAST_RECORD,
    NOTIFICATION_RECORD_IS_NOT_EXISTED,
    NOTIFICATION_NO_PERMISSION_DO_TASK,
    NOTIFICATION_FEATURE_NOT_AVAILABLE_IN_SUBSCRIPTION,
    NOTIFICATION_FEATURE_NOT_AVAILABLE_IN_VERSION,

    WINDOW_ATTENTION_TITLE,
    WINDOW_INFORMATION_TITLE,
    WINDOW_WARNING_TITLE,
    WINDOW_ERROR_TITLE,

    BROWSER_PREVIEW_ITEM_TITLE,
    BROWSER_ADD_ITEM_TITLE,
    BROWSER_EDIT_ITEM_TITLE,

    ERROR_USER_NOTICE_INFORMATION_MESSAGE,
    ERROR_USER_SYSTEM_ERROR,
    ERROR_USER_INPUT_MESSAGE,
    ERROR_USER_IS_NOT_EXISTED,

    BUTTON_SAVE,
    BUTTON_SAVE_NEW,
    BUTTON_SUBMIT,
    BUTTON_CREATE,
    BUTTON_CANCEL,
    BUTTON_DELETE,
    BUTTON_CLOSE,
    BUTTON_ASSIGN,
    BUTTON_ADD,
    BUTTON_CLONE,
    BUTTON_OPTION,
    BUTTON_REOPEN,
    BUTTON_OPEN,
    BUTTON_SELECT,
    BUTTON_NEW_FILTER,
    BUTTON_ADD_CRITERIA,
    BUTTON_YES,
    BUTTON_OK,
    BUTTON_NO,
    BUTTON_CLEAR,
    BUTTON_EDIT,
    BUTTON_ACCEPT,
    BUTTON_DOWNLOAD,
    BUTTON_UPLOAD,
    BUTTON_UP,
    BUTTON_MAIL,
    BUTTON_EXPORT_CSV,
    BUTTON_EXPORT_EXCEL,
    BUTTON_EXPORT_PDF,
    BUTTON_UPDATE_LABEL,
    BUTTON_SEARCH,
    BUTTON_ADVANCED_SEARCH,
    BUTTON_BASIC_SEARCH,
    BUTTON_POST,
    BUTTON_SIGNOUT,
    BUTTON_NAV_NEWER,
    BUTTON_NAV_OLDER,
    BUTTON_SUPPORT,
    BUTTON_RESET,
    BUTTON_UPDATE_OTHER_FIELDS,

    ACTION_SETUP,
    ACTION_SEND_EMAIL,
    ACTION_DONE,
    ACTION_BROWSE,
    ACTION_NEXT,
    ACTION_MORE,
    ACTION_CHANGE,
    ACTION_TRANSLATE,
    ACTION_HELP,
    ACTION_MODIFY,
    ACTION_SKIP,
    ACTION_PRINT,
    ACTION_EXPORT,
    ACTION_EXPORT_MAIL,
    ACTION_PREVIEW,
    ACTION_SELECT_VALUE,
    ACTION_SELECT_COLUMNS,
    ACTION_CLICK_TO_EDIT,
    ACTION_SORT,
    ACTION_CHARGE,
    ACTION_QUERY_BY_TEXT,
    ACTION_ADD_COMMENT,
    ACTION_RENAME,
    ACTION_MOVE,
    ACTION_SET_TIME,
    ACTION_HIDE_TIME,
    ACTION_SELECT_ALL_VALUE,
    ACTION_SELECT_PAGE_VALUE,
    ACTION_DESELECT_ALL,
    ACTION_CHANGE_COLOR,
    ACTION_NEW,

    TABLE_SELECTED_ITEM_TITLE,

    DIALOG_DELETE_TITLE,
    DIALOG_DELETE_SINGLE_ITEM_MESSAGE,
    DIALOG_DELETE_MULTIPLE_ITEMS_MESSAGE,

    CONFIRM_DELETE_ATTACHMENT,
    WINDOW_MASS_UPDATE_TITLE,
    WARNING_NOT_VALID_EMAIL,

    SAVE_FILTER_VALUE,
    EXCEED_BILLING_PLAN_MSG_FOR_ADMIN,
    EXCEED_BILLING_PLAN_MSG_FOR_USER,

    FORM_ASSIGNEE,
    FORM_DESCRIPTION,
    FORM_CREATED_TIME,
    FORM_LAST_UPDATED_TIME,
    FORM_LAST_ACCESSED_TIME,
    FORM_EMPTY,
    FORM_PROGRESS,
    FORM_ATTACHMENTS,
    FORM_START_DATE,
    FORM_END_DATE,
    FORM_DUE_DATE,
    FORM_STATUS,
    FORM_NAME,
    FORM_FIRSTNAME,
    FORM_LASTNAME,
    FORM_PHONE,
    FORM_EMAIL,
    FORM_TYPE,
    FORM_CURRENCY,
    FORM_DURATION,
    FORM_DATE_FORMAT_HELP,
    FORM_COMPANY,
    FORM_PRIORITY,
    FORM_PRIORITY_HELP,

    MODULE_CRM,
    MODULE_PROJECT,
    MODULE_DOCUMENT,
    MODULE_PEOPLE,

    VIEW_NO_ITEM_TITLE,
    VIEW_NO_ITEM_HINT,
    VIEW_DASHBOARD,

    TOOLTIP_MASS_UPDATE,
    TOOLTIP_SHOW_PREVIOUS_ITEM,
    TOOLTIP_SHOW_NEXT_ITEM,
    TOOLTIP_NO_ITEM_EXISTED,

    HELP_SPAM_FILTER_PREVENT_TITLE,
    HELP_SPAM_FILTER_PREVENT_MESSAGE,

    EXT_ADDED_COMMENT,
    EXT_MODIFIED_ITEM,
    EXT_NO_ITEM,

    OPT_ITEM_VALUE,
    OPT_SAVED_FILTER,
    OPT_CHANGE_HISTORY,
    OPT_MY_ITEMS,
    OPT_UNDEFINED,
    OPT_QUESTION,
    OPT_OLDEST_FIRST,
    OPT_NEWEST_FIRST,
    OPT_CUSTOMIZE_VIEW,
    OPT_AVAILABLE_COLUMNS,
    OPT_VIEW_COLUMNS,
    OPT_SORT_ASCENDING,
    OPT_SORT_DESCENDING,
    OPT_GROUP,
    OPT_SUCCESS,
    OPT_PLAIN,
    OPT_USER,
    OPT_LAYOUT_OPTIONS,
    OPT_LAST_MODIFIED,
    OPT_CONGRATS,
    OPT_CREATED_BY,
    OPT_CREATED_BY_USERS,
    OPT_TOTAL_VALUE,
    OPT_SELECTED,
    OPT_NOTE,
    OPT_COMMENTS_VALUE,
    OPT_COMMENTS,
    OPT_COMMENT,
    OPT_SIMPLE_MODE,
    OPT_CHART_MODE,
    OPT_SHARED_TO_ME,
    OPT_CHANGE_IMAGE,
    OPT_UPLOAD_IMAGE,

    M_BUTTON_BACK,
    M_BUTTON_SEND
}
