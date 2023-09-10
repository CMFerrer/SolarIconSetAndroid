package com.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MessagesConversationGroup

val MessagesConversationGroup.LetterOpened: ImageVector
    get() {
        if (_letterOpened != null) {
            return _letterOpened!!
        }
        _letterOpened = Builder(
            name = "LetterOpened", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 22.0002f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0002f, 19.6569f, 22.0002f, 20.8284f, 20.8286f)
                curveTo(22.0f, 19.6571f, 22.0f, 17.7714f, 22.0f, 14.0002f)
                curveTo(22.0f, 10.229f, 22.0f, 8.3434f, 20.8284f, 7.1718f)
                curveTo(20.4658f, 6.8092f, 20.0343f, 6.5588f, 19.4996f, 6.3859f)
                curveTo(19.5f, 6.5554f, 19.5f, 6.7288f, 19.5f, 6.9052f)
                lineTo(19.5f, 9.0633f)
                curveTo(19.5f, 9.0926f, 19.5003f, 9.1246f, 19.5006f, 9.1589f)
                curveTo(19.5035f, 9.4994f, 19.5085f, 10.07f, 19.264f, 10.592f)
                curveTo(19.0195f, 11.1141f, 18.578f, 11.4756f, 18.3145f, 11.6913f)
                curveTo(18.2882f, 11.7128f, 18.263f, 11.7334f, 18.2407f, 11.752f)
                lineTo(16.7342f, 13.0075f)
                curveTo(15.8734f, 13.7248f, 15.1241f, 14.3493f, 14.4505f, 14.7825f)
                curveTo(13.7245f, 15.2495f, 12.9391f, 15.5949f, 12.0f, 15.5949f)
                curveTo(11.0609f, 15.5949f, 10.2756f, 15.2495f, 9.5495f, 14.7825f)
                curveTo(8.8759f, 14.3493f, 8.1266f, 13.7248f, 7.2659f, 13.0075f)
                lineTo(5.7594f, 11.752f)
                curveTo(5.7368f, 11.7333f, 5.7121f, 11.713f, 5.6855f, 11.6913f)
                curveTo(5.4221f, 11.4756f, 4.9806f, 11.1141f, 4.736f, 10.592f)
                curveTo(4.4915f, 10.07f, 4.4965f, 9.4994f, 4.4994f, 9.1589f)
                curveTo(4.4997f, 9.1246f, 4.5f, 9.0926f, 4.5f, 9.0633f)
                lineTo(4.5f, 6.9052f)
                curveTo(4.5f, 6.7286f, 4.5f, 6.5553f, 4.5004f, 6.3856f)
                curveTo(3.9658f, 6.5585f, 3.5344f, 6.8089f, 3.1716f, 7.1718f)
                curveTo(2.0f, 8.3434f, 2.0f, 10.229f, 2.0f, 14.0002f)
                curveTo(2.0f, 17.7714f, 2.0f, 19.6571f, 3.1716f, 20.8286f)
                curveTo(4.3431f, 22.0002f, 6.2288f, 22.0002f, 10.0f, 22.0002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.7197f, 10.5997f)
                lineTo(8.159f, 11.7991f)
                curveTo(9.9956f, 13.3296f, 10.9139f, 14.0949f, 12.0001f, 14.0949f)
                curveTo(13.0862f, 14.0949f, 14.0046f, 13.3296f, 15.8412f, 11.7991f)
                lineTo(17.2805f, 10.5997f)
                curveTo(17.6343f, 10.3048f, 17.8113f, 10.1574f, 17.9057f, 9.9558f)
                curveTo(18.0001f, 9.7542f, 18.0001f, 9.5239f, 18.0001f, 9.0632f)
                verticalLineTo(7.0f)
                curveTo(18.0001f, 6.6794f, 18.0001f, 6.3805f, 17.9982f, 6.1017f)
                curveTo(17.9865f, 4.3306f, 17.9005f, 3.3649f, 17.2679f, 2.7322f)
                curveTo(16.5356f, 2.0f, 15.3571f, 2.0f, 13.0001f, 2.0f)
                horizontalLineTo(11.0001f)
                curveTo(8.6431f, 2.0f, 7.4646f, 2.0f, 6.7323f, 2.7322f)
                curveTo(6.0997f, 3.3649f, 6.0118f, 4.3306f, 6.0001f, 6.1017f)
                curveTo(5.9982f, 6.3805f, 6.0001f, 6.6794f, 6.0001f, 7.0f)
                verticalLineTo(9.0632f)
                curveTo(6.0001f, 9.5239f, 6.0001f, 9.7542f, 6.0945f, 9.9558f)
                curveTo(6.1889f, 10.1574f, 6.3658f, 10.3048f, 6.7197f, 10.5997f)
                close()
                moveTo(9.25f, 6.0f)
                curveTo(9.25f, 5.5858f, 9.5858f, 5.25f, 10.0f, 5.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 5.25f, 14.75f, 5.5858f, 14.75f, 6.0f)
                curveTo(14.75f, 6.4142f, 14.4142f, 6.75f, 14.0f, 6.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 6.75f, 9.25f, 6.4142f, 9.25f, 6.0f)
                close()
                moveTo(10.25f, 9.0f)
                curveTo(10.25f, 8.5858f, 10.5858f, 8.25f, 11.0f, 8.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 8.25f, 13.75f, 8.5858f, 13.75f, 9.0f)
                curveTo(13.75f, 9.4142f, 13.4142f, 9.75f, 13.0f, 9.75f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 9.75f, 10.25f, 9.4142f, 10.25f, 9.0f)
                close()
            }
        }
            .build()
        return _letterOpened!!
    }

private var _letterOpened: ImageVector? = null
