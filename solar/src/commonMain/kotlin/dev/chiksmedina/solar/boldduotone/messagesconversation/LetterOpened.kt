package dev.chiksmedina.solar.boldduotone.messagesconversation

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
import dev.chiksmedina.solar.boldduotone.MessagesConversationGroup

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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.1587f, 11.7993f)
                lineTo(6.7195f, 10.6f)
                curveTo(6.3656f, 10.3051f, 6.1887f, 10.1576f, 6.0943f, 9.956f)
                curveTo(5.9998f, 9.7545f, 5.9998f, 9.5242f, 5.9998f, 9.0635f)
                verticalLineTo(7.0003f)
                curveTo(5.9998f, 6.891f, 5.9996f, 6.7842f, 5.9994f, 6.6799f)
                curveTo(5.999f, 6.4782f, 5.9986f, 6.2857f, 5.9998f, 6.102f)
                curveTo(4.6998f, 6.2298f, 3.8247f, 6.5187f, 3.1716f, 7.1718f)
                curveTo(2.0f, 8.3434f, 2.0f, 10.2299f, 2.0f, 14.0011f)
                curveTo(2.0f, 17.7723f, 2.0f, 19.658f, 3.1716f, 20.8295f)
                curveTo(4.3431f, 22.0011f, 6.2288f, 22.0011f, 10.0f, 22.0011f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0011f, 19.6569f, 22.0011f, 20.8284f, 20.8295f)
                curveTo(22.0f, 19.658f, 22.0f, 17.7723f, 22.0f, 14.0011f)
                curveTo(22.0f, 10.2299f, 22.0f, 8.3434f, 20.8284f, 7.1718f)
                curveTo(20.1749f, 6.5183f, 19.2992f, 6.2293f, 17.998f, 6.1016f)
                curveTo(17.9998f, 6.3804f, 17.9998f, 6.6796f, 17.9998f, 7.0003f)
                verticalLineTo(9.0635f)
                curveTo(17.9998f, 9.5242f, 17.9998f, 9.7545f, 17.9054f, 9.956f)
                curveTo(17.811f, 10.1576f, 17.6341f, 10.3051f, 17.2802f, 10.6f)
                lineTo(15.8409f, 11.7993f)
                curveTo(14.0043f, 13.3299f, 13.086f, 14.0951f, 11.9998f, 14.0951f)
                curveTo(10.9137f, 14.0951f, 9.9954f, 13.3299f, 8.1587f, 11.7993f)
                close()
            }
        }
            .build()
        return _letterOpened!!
    }

private var _letterOpened: ImageVector? = null
