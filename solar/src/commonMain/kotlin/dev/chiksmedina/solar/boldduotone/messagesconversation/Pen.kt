package dev.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MessagesConversationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.8482f, 8.7131f)
                curveTo(22.3839f, 7.1774f, 22.3839f, 4.6875f, 20.8482f, 3.1518f)
                curveTo(19.3125f, 1.6161f, 16.8226f, 1.6161f, 15.2869f, 3.1518f)
                lineTo(14.3999f, 4.0388f)
                curveTo(14.412f, 4.0755f, 14.4246f, 4.1127f, 14.4377f, 4.1504f)
                curveTo(14.7628f, 5.0875f, 15.3763f, 6.316f, 16.5303f, 7.47f)
                curveTo(17.6843f, 8.624f, 18.9128f, 9.2375f, 19.85f, 9.5626f)
                curveTo(19.8875f, 9.5756f, 19.9245f, 9.5882f, 19.961f, 9.6003f)
                lineTo(20.8482f, 8.7131f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.4386f, 4.001f)
                lineTo(14.4004f, 4.0392f)
                curveTo(14.4125f, 4.0759f, 14.4251f, 4.113f, 14.4382f, 4.1507f)
                curveTo(14.7633f, 5.0879f, 15.3768f, 6.3164f, 16.5308f, 7.4704f)
                curveTo(17.6848f, 8.6244f, 18.9133f, 9.2378f, 19.8505f, 9.563f)
                curveTo(19.8876f, 9.5759f, 19.9243f, 9.5883f, 19.9606f, 9.6003f)
                lineTo(11.4001f, 18.1608f)
                curveTo(10.823f, 18.7379f, 10.5343f, 19.0265f, 10.2162f, 19.2747f)
                curveTo(9.8408f, 19.5674f, 9.4347f, 19.8184f, 9.005f, 20.0232f)
                curveTo(8.6407f, 20.1968f, 8.2535f, 20.3259f, 7.4792f, 20.584f)
                lineTo(3.3958f, 21.9451f)
                curveTo(3.0148f, 22.0721f, 2.5947f, 21.973f, 2.3106f, 21.6889f)
                curveTo(2.0266f, 21.4049f, 1.9274f, 20.9848f, 2.0545f, 20.6037f)
                lineTo(3.4156f, 16.5204f)
                curveTo(3.6737f, 15.7461f, 3.8027f, 15.3589f, 3.9763f, 14.9946f)
                curveTo(4.1811f, 14.5649f, 4.4321f, 14.1588f, 4.7249f, 13.7834f)
                curveTo(4.9731f, 13.4652f, 5.2617f, 13.1767f, 5.8387f, 12.5996f)
                lineTo(14.4386f, 4.001f)
                close()
            }
        }
            .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
