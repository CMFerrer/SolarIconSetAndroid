package dev.chiksmedina.solar.bold.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.CallGroup

val CallGroup.EndCall: ImageVector
    get() {
        if (_endCall != null) {
            return _endCall!!
        }
        _endCall = Builder(
            name = "EndCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 13.4783f)
                lineTo(8.0f, 12.8618f)
                curveTo(8.0f, 12.8618f, 8.0f, 11.3964f, 12.0f, 11.3964f)
                curveTo(16.0f, 11.3964f, 16.0f, 12.8618f, 16.0f, 12.8618f)
                verticalLineTo(13.2501f)
                curveTo(16.0f, 14.2065f, 16.7227f, 15.0193f, 17.7004f, 15.1626f)
                lineTo(19.7004f, 15.4557f)
                curveTo(20.9105f, 15.633f, 22.0f, 14.7268f, 22.0f, 13.5431f)
                verticalLineTo(11.4184f)
                curveTo(22.0f, 10.8314f, 21.8162f, 10.2543f, 21.3703f, 9.8561f)
                curveTo(20.2296f, 8.8374f, 17.4208f, 7.0001f, 12.0f, 7.0001f)
                curveTo(6.2514f, 7.0001f, 3.4403f, 9.5828f, 2.4408f, 10.789f)
                curveTo(2.1247f, 11.1706f, 2.0f, 11.6526f, 2.0f, 12.1416f)
                lineTo(2.0f, 14.0645f)
                curveTo(2.0f, 15.3625f, 3.2956f, 16.2921f, 4.58f, 15.9157f)
                lineTo(6.58f, 15.3296f)
                curveTo(7.4233f, 15.0825f, 8.0f, 14.3306f, 8.0f, 13.4783f)
                close()
            }
        }
            .build()
        return _endCall!!
    }

private var _endCall: ImageVector? = null
