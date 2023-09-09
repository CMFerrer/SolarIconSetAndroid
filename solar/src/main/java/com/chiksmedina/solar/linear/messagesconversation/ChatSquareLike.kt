package com.chiksmedina.solar.linear.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MessagesConversationGroup

public val MessagesConversationGroup.ChatSquareLike: ImageVector
    get() {
        if (_chatSquareLike != null) {
            return _chatSquareLike!!
        }
        _chatSquareLike = Builder(name = "ChatSquareLike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0867f, 21.3877f)
                lineTo(13.7321f, 21.7697f)
                lineTo(13.7321f, 21.7697f)
                lineTo(13.0867f, 21.3877f)
                close()
                moveTo(13.6288f, 20.4718f)
                lineTo(12.9833f, 20.0898f)
                lineTo(12.9833f, 20.0898f)
                lineTo(13.6288f, 20.4718f)
                close()
                moveTo(10.3712f, 20.4718f)
                lineTo(9.7258f, 20.8539f)
                lineTo(9.7258f, 20.8539f)
                lineTo(10.3712f, 20.4718f)
                close()
                moveTo(10.9133f, 21.3877f)
                lineTo(11.5587f, 21.0057f)
                lineTo(11.5587f, 21.0057f)
                lineTo(10.9133f, 21.3877f)
                close()
                moveTo(2.3806f, 15.9134f)
                lineTo(3.0735f, 15.6264f)
                lineTo(3.0735f, 15.6264f)
                lineTo(2.3806f, 15.9134f)
                close()
                moveTo(7.7896f, 18.9915f)
                lineTo(7.7767f, 19.7413f)
                lineTo(7.7767f, 19.7413f)
                lineTo(7.7896f, 18.9915f)
                close()
                moveTo(5.0866f, 18.6194f)
                lineTo(4.7996f, 19.3123f)
                lineTo(4.7996f, 19.3123f)
                lineTo(5.0866f, 18.6194f)
                close()
                moveTo(21.6194f, 15.9134f)
                lineTo(22.3123f, 16.2004f)
                lineTo(22.3123f, 16.2004f)
                lineTo(21.6194f, 15.9134f)
                close()
                moveTo(16.2104f, 18.9915f)
                lineTo(16.1975f, 18.2416f)
                lineTo(16.1975f, 18.2416f)
                lineTo(16.2104f, 18.9915f)
                close()
                moveTo(18.9134f, 18.6194f)
                lineTo(19.2004f, 19.3123f)
                lineTo(19.2004f, 19.3123f)
                lineTo(18.9134f, 18.6194f)
                close()
                moveTo(19.6125f, 2.7368f)
                lineTo(19.2206f, 3.3763f)
                lineTo(19.2206f, 3.3763f)
                lineTo(19.6125f, 2.7368f)
                close()
                moveTo(21.2632f, 4.3875f)
                lineTo(21.9027f, 3.9956f)
                lineTo(21.9027f, 3.9956f)
                lineTo(21.2632f, 4.3875f)
                close()
                moveTo(4.3875f, 2.7368f)
                lineTo(3.9956f, 2.0973f)
                lineTo(3.9956f, 2.0973f)
                lineTo(4.3875f, 2.7368f)
                close()
                moveTo(2.7368f, 4.3875f)
                lineTo(2.0973f, 3.9956f)
                lineTo(2.0973f, 3.9956f)
                lineTo(2.7368f, 4.3875f)
                close()
                moveTo(9.4028f, 19.2098f)
                lineTo(9.7799f, 18.5615f)
                lineTo(9.7799f, 18.5615f)
                lineTo(9.4028f, 19.2098f)
                close()
                moveTo(13.7321f, 21.7697f)
                lineTo(14.2742f, 20.8539f)
                lineTo(12.9833f, 20.0898f)
                lineTo(12.4412f, 21.0057f)
                lineTo(13.7321f, 21.7697f)
                close()
                moveTo(9.7258f, 20.8539f)
                lineTo(10.2679f, 21.7697f)
                lineTo(11.5587f, 21.0057f)
                lineTo(11.0166f, 20.0898f)
                lineTo(9.7258f, 20.8539f)
                close()
                moveTo(12.4412f, 21.0057f)
                curveTo(12.2485f, 21.3313f, 11.7515f, 21.3313f, 11.5587f, 21.0057f)
                lineTo(10.2679f, 21.7697f)
                curveTo(11.0415f, 23.0767f, 12.9585f, 23.0767f, 13.7321f, 21.7697f)
                lineTo(12.4412f, 21.0057f)
                close()
                moveTo(10.5f, 2.75f)
                horizontalLineTo(13.5f)
                verticalLineTo(1.25f)
                horizontalLineTo(10.5f)
                verticalLineTo(2.75f)
                close()
                moveTo(21.25f, 10.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(22.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(21.25f)
                close()
                moveTo(2.75f, 11.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(1.25f)
                verticalLineTo(11.5f)
                horizontalLineTo(2.75f)
                close()
                moveTo(1.25f, 11.5f)
                curveTo(1.25f, 12.6546f, 1.2496f, 13.5581f, 1.2993f, 14.2868f)
                curveTo(1.3495f, 15.0223f, 1.4532f, 15.6344f, 1.6877f, 16.2004f)
                lineTo(3.0735f, 15.6264f)
                curveTo(2.9274f, 15.2736f, 2.8408f, 14.8438f, 2.7958f, 14.1847f)
                curveTo(2.7504f, 13.5189f, 2.75f, 12.6751f, 2.75f, 11.5f)
                horizontalLineTo(1.25f)
                close()
                moveTo(7.8025f, 18.2416f)
                curveTo(6.5471f, 18.2199f, 5.8892f, 18.1401f, 5.3736f, 17.9265f)
                lineTo(4.7996f, 19.3123f)
                curveTo(5.6045f, 19.6457f, 6.5214f, 19.7197f, 7.7767f, 19.7413f)
                lineTo(7.8025f, 18.2416f)
                close()
                moveTo(1.6877f, 16.2004f)
                curveTo(2.2713f, 17.6093f, 3.3907f, 18.7287f, 4.7996f, 19.3123f)
                lineTo(5.3736f, 17.9265f)
                curveTo(4.3322f, 17.4951f, 3.5049f, 16.6678f, 3.0735f, 15.6264f)
                lineTo(1.6877f, 16.2004f)
                close()
                moveTo(21.25f, 11.5f)
                curveTo(21.25f, 12.6751f, 21.2496f, 13.5189f, 21.2042f, 14.1847f)
                curveTo(21.1592f, 14.8438f, 21.0726f, 15.2736f, 20.9265f, 15.6264f)
                lineTo(22.3123f, 16.2004f)
                curveTo(22.5468f, 15.6344f, 22.6505f, 15.0223f, 22.7007f, 14.2868f)
                curveTo(22.7504f, 13.5581f, 22.75f, 12.6546f, 22.75f, 11.5f)
                horizontalLineTo(21.25f)
                close()
                moveTo(16.2233f, 19.7413f)
                curveTo(17.4786f, 19.7197f, 18.3955f, 19.6457f, 19.2004f, 19.3123f)
                lineTo(18.6264f, 17.9265f)
                curveTo(18.1108f, 18.1401f, 17.4529f, 18.2199f, 16.1975f, 18.2416f)
                lineTo(16.2233f, 19.7413f)
                close()
                moveTo(20.9265f, 15.6264f)
                curveTo(20.4951f, 16.6678f, 19.6678f, 17.4951f, 18.6264f, 17.9265f)
                lineTo(19.2004f, 19.3123f)
                curveTo(20.6093f, 18.7287f, 21.7287f, 17.6093f, 22.3123f, 16.2004f)
                lineTo(20.9265f, 15.6264f)
                close()
                moveTo(13.5f, 2.75f)
                curveTo(15.1512f, 2.75f, 16.337f, 2.7508f, 17.2619f, 2.8387f)
                curveTo(18.1757f, 2.9256f, 18.7571f, 3.0922f, 19.2206f, 3.3763f)
                lineTo(20.0044f, 2.0973f)
                curveTo(19.2655f, 1.6446f, 18.4274f, 1.4428f, 17.4039f, 1.3455f)
                curveTo(16.3915f, 1.2492f, 15.1222f, 1.25f, 13.5f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(22.75f, 10.5f)
                curveTo(22.75f, 8.8778f, 22.7508f, 7.6085f, 22.6545f, 6.5961f)
                curveTo(22.5572f, 5.5726f, 22.3554f, 4.7344f, 21.9027f, 3.9956f)
                lineTo(20.6237f, 4.7794f)
                curveTo(20.9078f, 5.2429f, 21.0744f, 5.8243f, 21.1613f, 6.7381f)
                curveTo(21.2492f, 7.663f, 21.25f, 8.8488f, 21.25f, 10.5f)
                horizontalLineTo(22.75f)
                close()
                moveTo(19.2206f, 3.3763f)
                curveTo(19.7925f, 3.7267f, 20.2733f, 4.2075f, 20.6237f, 4.7794f)
                lineTo(21.9027f, 3.9956f)
                curveTo(21.4286f, 3.2219f, 20.7781f, 2.5714f, 20.0044f, 2.0973f)
                lineTo(19.2206f, 3.3763f)
                close()
                moveTo(10.5f, 1.25f)
                curveTo(8.8778f, 1.25f, 7.6085f, 1.2492f, 6.5961f, 1.3455f)
                curveTo(5.5726f, 1.4428f, 4.7344f, 1.6446f, 3.9956f, 2.0973f)
                lineTo(4.7794f, 3.3763f)
                curveTo(5.2429f, 3.0922f, 5.8243f, 2.9256f, 6.7381f, 2.8387f)
                curveTo(7.663f, 2.7508f, 8.8488f, 2.75f, 10.5f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(2.75f, 10.5f)
                curveTo(2.75f, 8.8488f, 2.7508f, 7.663f, 2.8387f, 6.7381f)
                curveTo(2.9256f, 5.8243f, 3.0922f, 5.2429f, 3.3763f, 4.7794f)
                lineTo(2.0973f, 3.9956f)
                curveTo(1.6446f, 4.7344f, 1.4428f, 5.5726f, 1.3455f, 6.5961f)
                curveTo(1.2492f, 7.6085f, 1.25f, 8.8778f, 1.25f, 10.5f)
                horizontalLineTo(2.75f)
                close()
                moveTo(3.9956f, 2.0973f)
                curveTo(3.2219f, 2.5714f, 2.5714f, 3.2219f, 2.0973f, 3.9956f)
                lineTo(3.3763f, 4.7794f)
                curveTo(3.7267f, 4.2075f, 4.2075f, 3.7267f, 4.7794f, 3.3763f)
                lineTo(3.9956f, 2.0973f)
                close()
                moveTo(11.0166f, 20.0898f)
                curveTo(10.8136f, 19.7468f, 10.6354f, 19.4441f, 10.4621f, 19.2063f)
                curveTo(10.2795f, 18.9559f, 10.0702f, 18.7304f, 9.7799f, 18.5615f)
                lineTo(9.0257f, 19.8582f)
                curveTo(9.0731f, 19.8857f, 9.1377f, 19.936f, 9.2499f, 20.0898f)
                curveTo(9.3712f, 20.2564f, 9.5084f, 20.4865f, 9.7258f, 20.8539f)
                lineTo(11.0166f, 20.0898f)
                close()
                moveTo(7.7767f, 19.7413f)
                curveTo(8.2157f, 19.7489f, 8.4939f, 19.7545f, 8.7059f, 19.7779f)
                curveTo(8.904f, 19.7999f, 8.9808f, 19.832f, 9.0257f, 19.8582f)
                lineTo(9.7799f, 18.5615f)
                curveTo(9.4871f, 18.3912f, 9.1825f, 18.3215f, 8.871f, 18.287f)
                curveTo(8.5734f, 18.2541f, 8.2137f, 18.2487f, 7.8025f, 18.2416f)
                lineTo(7.7767f, 19.7413f)
                close()
                moveTo(14.2742f, 20.8539f)
                curveTo(14.4916f, 20.4865f, 14.6287f, 20.2564f, 14.7501f, 20.0898f)
                curveTo(14.8622f, 19.936f, 14.9268f, 19.8857f, 14.9742f, 19.8582f)
                lineTo(14.2201f, 18.5615f)
                curveTo(13.9298f, 18.7304f, 13.7204f, 18.9559f, 13.5379f, 19.2063f)
                curveTo(13.3646f, 19.4441f, 13.1864f, 19.7468f, 12.9833f, 20.0898f)
                lineTo(14.2742f, 20.8539f)
                close()
                moveTo(16.1975f, 18.2416f)
                curveTo(15.7862f, 18.2487f, 15.4266f, 18.2541f, 15.129f, 18.287f)
                curveTo(14.8175f, 18.3215f, 14.5129f, 18.3912f, 14.2201f, 18.5615f)
                lineTo(14.9742f, 19.8582f)
                curveTo(15.0192f, 19.832f, 15.096f, 19.7999f, 15.2941f, 19.7779f)
                curveTo(15.5061f, 19.7545f, 15.7842f, 19.7489f, 16.2233f, 19.7413f)
                lineTo(16.1975f, 18.2416f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9901f, 14.3082f)
                lineTo(11.435f, 13.7045f)
                lineTo(11.435f, 13.7045f)
                lineTo(10.9901f, 14.3082f)
                close()
                moveTo(12.0f, 8.1061f)
                lineTo(11.4641f, 8.6309f)
                curveTo(11.6052f, 8.775f, 11.7983f, 8.8561f, 12.0f, 8.8561f)
                curveTo(12.2017f, 8.8561f, 12.3948f, 8.775f, 12.5359f, 8.6309f)
                lineTo(12.0f, 8.1061f)
                close()
                moveTo(13.0099f, 14.3082f)
                lineTo(12.565f, 13.7045f)
                lineTo(12.565f, 13.7045f)
                lineTo(13.0099f, 14.3082f)
                close()
                moveTo(12.0f, 14.8103f)
                lineTo(12.0f, 14.0603f)
                lineTo(12.0f, 14.0603f)
                lineTo(12.0f, 14.8103f)
                close()
                moveTo(11.435f, 13.7045f)
                curveTo(10.7914f, 13.2302f, 9.9675f, 12.5568f, 9.3118f, 11.808f)
                curveTo(8.6328f, 11.0325f, 8.25f, 10.3064f, 8.25f, 9.7148f)
                horizontalLineTo(6.75f)
                curveTo(6.75f, 10.8757f, 7.4489f, 11.9574f, 8.1832f, 12.7961f)
                curveTo(8.9409f, 13.6614f, 9.8619f, 14.4085f, 10.5451f, 14.912f)
                lineTo(11.435f, 13.7045f)
                close()
                moveTo(8.25f, 9.7148f)
                curveTo(8.25f, 8.607f, 8.7445f, 8.0237f, 9.2533f, 7.8335f)
                curveTo(9.7705f, 7.6401f, 10.5951f, 7.7433f, 11.4641f, 8.6309f)
                lineTo(12.5359f, 7.5814f)
                curveTo(11.38f, 6.4009f, 9.9546f, 5.9699f, 8.728f, 6.4285f)
                curveTo(7.493f, 6.8903f, 6.75f, 8.1453f, 6.75f, 9.7148f)
                horizontalLineTo(8.25f)
                close()
                moveTo(13.4549f, 14.912f)
                curveTo(14.1381f, 14.4085f, 15.0591f, 13.6614f, 15.8168f, 12.7961f)
                curveTo(16.5511f, 11.9574f, 17.25f, 10.8758f, 17.25f, 9.7148f)
                horizontalLineTo(15.75f)
                curveTo(15.75f, 10.3064f, 15.3672f, 11.0326f, 14.6882f, 11.808f)
                curveTo(14.0325f, 12.5568f, 13.2086f, 13.2302f, 12.565f, 13.7045f)
                lineTo(13.4549f, 14.912f)
                close()
                moveTo(17.25f, 9.7148f)
                curveTo(17.25f, 8.1453f, 16.507f, 6.8903f, 15.272f, 6.4285f)
                curveTo(14.0454f, 5.9699f, 12.62f, 6.4009f, 11.4641f, 7.5814f)
                lineTo(12.5359f, 8.6309f)
                curveTo(13.4049f, 7.7433f, 14.2295f, 7.6401f, 14.7467f, 7.8335f)
                curveTo(15.2555f, 8.0237f, 15.75f, 8.607f, 15.75f, 9.7148f)
                horizontalLineTo(17.25f)
                close()
                moveTo(10.5451f, 14.912f)
                curveTo(10.9368f, 15.2007f, 11.3752f, 15.5603f, 12.0f, 15.5603f)
                lineTo(12.0f, 14.0603f)
                curveTo(11.9852f, 14.0603f, 11.9682f, 14.0626f, 11.899f, 14.0252f)
                curveTo(11.8008f, 13.972f, 11.678f, 13.8836f, 11.435f, 13.7045f)
                lineTo(10.5451f, 14.912f)
                close()
                moveTo(12.565f, 13.7045f)
                curveTo(12.322f, 13.8836f, 12.1992f, 13.972f, 12.101f, 14.0252f)
                curveTo(12.0318f, 14.0626f, 12.0148f, 14.0603f, 12.0f, 14.0603f)
                lineTo(12.0f, 15.5603f)
                curveTo(12.6248f, 15.5603f, 13.0632f, 15.2007f, 13.4549f, 14.912f)
                lineTo(12.565f, 13.7045f)
                close()
            }
        }
        .build()
        return _chatSquareLike!!
    }

private var _chatSquareLike: ImageVector? = null
