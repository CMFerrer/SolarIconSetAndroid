package dev.chiksmedina.solar.lineduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.MessagesConversationGroup

val MessagesConversationGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(
            name = "Pen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.2869f, 3.1518f)
                lineTo(14.3601f, 4.0787f)
                lineTo(5.8388f, 12.5999f)
                lineTo(5.8388f, 12.5999f)
                curveTo(5.2617f, 13.1771f, 4.9731f, 13.4656f, 4.7249f, 13.7838f)
                curveTo(4.4321f, 14.1592f, 4.1811f, 14.5653f, 3.9763f, 14.995f)
                curveTo(3.8027f, 15.3593f, 3.6737f, 15.7465f, 3.4156f, 16.5208f)
                lineTo(2.3218f, 19.8021f)
                lineTo(2.0545f, 20.6042f)
                curveTo(1.9274f, 20.9852f, 2.0266f, 21.4053f, 2.3106f, 21.6894f)
                curveTo(2.5947f, 21.9734f, 3.0148f, 22.0726f, 3.3958f, 21.9456f)
                lineTo(4.1979f, 21.6782f)
                lineTo(7.4792f, 20.5844f)
                lineTo(7.4792f, 20.5844f)
                curveTo(8.2535f, 20.3263f, 8.6407f, 20.1973f, 9.005f, 20.0237f)
                curveTo(9.4347f, 19.8189f, 9.8408f, 19.5679f, 10.2162f, 19.2751f)
                curveTo(10.5344f, 19.0269f, 10.8229f, 18.7383f, 11.4001f, 18.1612f)
                lineTo(11.4001f, 18.1612f)
                lineTo(19.9213f, 9.6399f)
                lineTo(20.8482f, 8.7131f)
                curveTo(22.3839f, 7.1774f, 22.3839f, 4.6875f, 20.8482f, 3.1518f)
                curveTo(19.3125f, 1.6161f, 16.8226f, 1.6161f, 15.2869f, 3.1518f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.36f, 4.0781f)
                curveTo(14.36f, 4.0781f, 14.4759f, 6.0477f, 16.2138f, 7.7856f)
                curveTo(17.9517f, 9.5235f, 19.9213f, 9.6394f, 19.9213f, 9.6394f)
                moveTo(4.1979f, 21.6777f)
                lineTo(2.3218f, 19.8015f)
            }
        }
            .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
