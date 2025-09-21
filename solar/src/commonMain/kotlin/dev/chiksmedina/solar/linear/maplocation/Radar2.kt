package dev.chiksmedina.solar.linear.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.MapLocationGroup

val MapLocationGroup.Radar2: ImageVector
    get() {
        if (_radar2 != null) {
            return _radar2!!
        }
        _radar2 = Builder(
            name = "Radar2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.6592f, 14.5877f)
                lineTo(20.9348f, 14.3936f)
                lineTo(20.9348f, 14.3936f)
                lineTo(21.6592f, 14.5877f)
                close()
                moveTo(9.4118f, 21.6588f)
                lineTo(9.2177f, 22.3833f)
                lineTo(9.2177f, 22.3833f)
                lineTo(9.4118f, 21.6588f)
                close()
                moveTo(2.3407f, 9.4114f)
                lineTo(1.6163f, 9.2172f)
                lineTo(1.6163f, 9.2172f)
                lineTo(2.3407f, 9.4114f)
                close()
                moveTo(14.5882f, 2.3403f)
                lineTo(14.3941f, 3.0647f)
                lineTo(14.3941f, 3.0647f)
                lineTo(14.5882f, 2.3403f)
                close()
                moveTo(11.5281f, 12.5825f)
                curveTo(11.8501f, 12.8431f, 12.3224f, 12.7934f, 12.583f, 12.4714f)
                curveTo(12.8435f, 12.1494f, 12.7938f, 11.6772f, 12.4718f, 11.4166f)
                lineTo(11.5281f, 12.5825f)
                close()
                moveTo(5.0019f, 6.3355f)
                lineTo(5.4738f, 5.7525f)
                lineTo(5.4738f, 5.7525f)
                lineTo(5.0019f, 6.3355f)
                close()
                moveTo(3.6359f, 6.5135f)
                lineTo(3.0087f, 6.1023f)
                lineTo(3.0087f, 6.1023f)
                lineTo(3.6359f, 6.5135f)
                close()
                moveTo(6.7183f, 2.6365f)
                curveTo(6.3576f, 2.84f, 6.2301f, 3.2975f, 6.4336f, 3.6583f)
                curveTo(6.6372f, 4.019f, 7.0946f, 4.1465f, 7.4554f, 3.9429f)
                lineTo(6.7183f, 2.6365f)
                close()
                moveTo(9.8658f, 5.5941f)
                curveTo(9.4728f, 5.725f, 9.2603f, 6.1497f, 9.3912f, 6.5427f)
                curveTo(9.5221f, 6.9356f, 9.9468f, 7.1481f, 10.3398f, 7.0173f)
                lineTo(9.8658f, 5.5941f)
                close()
                moveTo(20.9348f, 14.3936f)
                curveTo(19.6126f, 19.3282f, 14.5405f, 22.2566f, 9.6059f, 20.9344f)
                lineTo(9.2177f, 22.3833f)
                curveTo(14.9524f, 23.9199f, 20.8471f, 20.5166f, 22.3837f, 14.7819f)
                lineTo(20.9348f, 14.3936f)
                close()
                moveTo(9.6059f, 20.9344f)
                curveTo(4.6713f, 19.6122f, 1.7429f, 14.54f, 3.0652f, 9.6055f)
                lineTo(1.6163f, 9.2172f)
                curveTo(0.0797f, 14.952f, 3.4829f, 20.8466f, 9.2177f, 22.3833f)
                lineTo(9.6059f, 20.9344f)
                close()
                moveTo(14.3941f, 3.0647f)
                curveTo(19.3286f, 4.387f, 22.257f, 9.4591f, 20.9348f, 14.3936f)
                lineTo(22.3837f, 14.7819f)
                curveTo(23.9203f, 9.0471f, 20.517f, 3.1525f, 14.7823f, 1.6158f)
                lineTo(14.3941f, 3.0647f)
                close()
                moveTo(12.4718f, 11.4166f)
                lineTo(5.4738f, 5.7525f)
                lineTo(4.5301f, 6.9184f)
                lineTo(11.5281f, 12.5825f)
                lineTo(12.4718f, 11.4166f)
                close()
                moveTo(3.0652f, 9.6055f)
                curveTo(3.3276f, 8.626f, 3.7371f, 7.727f, 4.2631f, 6.9247f)
                lineTo(3.0087f, 6.1023f)
                curveTo(2.3963f, 7.0363f, 1.9205f, 8.0817f, 1.6163f, 9.2172f)
                lineTo(3.0652f, 9.6055f)
                close()
                moveTo(7.4554f, 3.9429f)
                curveTo(9.4913f, 2.7943f, 11.9587f, 2.4122f, 14.3941f, 3.0647f)
                lineTo(14.7823f, 1.6158f)
                curveTo(11.9525f, 0.8576f, 9.0823f, 1.3028f, 6.7183f, 2.6365f)
                lineTo(7.4554f, 3.9429f)
                close()
                moveTo(5.4738f, 5.7525f)
                curveTo(4.7405f, 5.159f, 3.5827f, 5.2268f, 3.0087f, 6.1023f)
                lineTo(4.2631f, 6.9247f)
                curveTo(4.2853f, 6.8909f, 4.3161f, 6.8712f, 4.3615f, 6.8657f)
                curveTo(4.4114f, 6.8597f, 4.4742f, 6.8732f, 4.5301f, 6.9184f)
                lineTo(5.4738f, 5.7525f)
                close()
                moveTo(17.25f, 11.9996f)
                curveTo(17.25f, 14.899f, 14.8995f, 17.2496f, 12.0f, 17.2496f)
                verticalLineTo(18.7496f)
                curveTo(15.7279f, 18.7496f, 18.75f, 15.7275f, 18.75f, 11.9996f)
                horizontalLineTo(17.25f)
                close()
                moveTo(12.0f, 17.2496f)
                curveTo(9.1005f, 17.2496f, 6.75f, 14.899f, 6.75f, 11.9996f)
                horizontalLineTo(5.25f)
                curveTo(5.25f, 15.7275f, 8.2721f, 18.7496f, 12.0f, 18.7496f)
                verticalLineTo(17.2496f)
                close()
                moveTo(12.0f, 6.7495f)
                curveTo(14.8995f, 6.7495f, 17.25f, 9.1001f, 17.25f, 11.9996f)
                horizontalLineTo(18.75f)
                curveTo(18.75f, 8.2716f, 15.7279f, 5.2495f, 12.0f, 5.2495f)
                verticalLineTo(6.7495f)
                close()
                moveTo(6.75f, 11.9996f)
                curveTo(6.75f, 10.7308f, 7.1991f, 9.569f, 7.9477f, 8.6614f)
                lineTo(6.7906f, 7.7069f)
                curveTo(5.8285f, 8.8733f, 5.25f, 10.3699f, 5.25f, 11.9996f)
                horizontalLineTo(6.75f)
                close()
                moveTo(10.3398f, 7.0173f)
                curveTo(10.8606f, 6.8438f, 11.4185f, 6.7495f, 12.0f, 6.7495f)
                verticalLineTo(5.2495f)
                curveTo(11.2554f, 5.2495f, 10.5375f, 5.3704f, 9.8658f, 5.5941f)
                lineTo(10.3398f, 7.0173f)
                close()
            }
        }
            .build()
        return _radar2!!
    }

private var _radar2: ImageVector? = null
