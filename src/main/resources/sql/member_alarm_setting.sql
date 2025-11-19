create table tbl_member_alarm_setting (
      id bigint generated always as identity primary key,
      company_experience_notice_alarm status default 'active' not null,
      company_intern_notice_alarm status default 'active' not null,
      member_id bigint not null,
      constraint fk_member_alarm_setting_member foreign key(member_id)
          references tbl_member(user_id)
);
