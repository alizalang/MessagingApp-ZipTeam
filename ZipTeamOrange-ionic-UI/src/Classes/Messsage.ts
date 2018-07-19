import { Chat } from "./Chat";
import { User } from "./user";

export class Message{
    id: number;
    message: String;
    private chat: Chat;
    private user: User;
}