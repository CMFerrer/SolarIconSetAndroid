package dev.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.SimCardMinimalistic: ImageVector
    get() {
        if (_simCardMinimalistic != null) {
            return _simCardMinimalistic!!
        }
        _simCardMinimalistic = Builder(
            name = "SimCardMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(12.3415f, 2.0f, 12.5122f, 2.0f, 12.6858f, 2.0152f)
                curveTo(13.4951f, 2.0858f, 14.2874f, 2.414f, 14.9097f, 2.9363f)
                curveTo(15.0431f, 3.0484f, 15.1668f, 3.1721f, 15.4142f, 3.4194f)
                lineTo(20.5806f, 8.5858f)
                curveTo(20.828f, 8.8332f, 20.9516f, 8.9569f, 21.0637f, 9.0903f)
                curveTo(21.586f, 9.7126f, 21.9142f, 10.5049f, 21.9848f, 11.3142f)
                curveTo(22.0f, 11.4878f, 22.0f, 11.6585f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.4907f, 19.5618f, 2.1644f, 18.1934f, 2.0551f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 13.0f)
                horizontalLineTo(9.5f)
                curveTo(9.0353f, 13.0f, 8.803f, 13.0f, 8.6098f, 13.0384f)
                curveTo(7.8164f, 13.1962f, 7.1962f, 13.8164f, 7.0384f, 14.6098f)
                curveTo(7.0f, 14.803f, 7.0f, 15.0353f, 7.0f, 15.5f)
                curveTo(7.0f, 15.9647f, 7.0f, 16.197f, 7.0384f, 16.3902f)
                curveTo(7.1962f, 17.1836f, 7.8164f, 17.8038f, 8.6098f, 17.9616f)
                curveTo(8.803f, 18.0f, 9.0353f, 18.0f, 9.5f, 18.0f)
                horizontalLineTo(14.5f)
                curveTo(14.9647f, 18.0f, 15.197f, 18.0f, 15.3902f, 17.9616f)
                curveTo(16.1836f, 17.8038f, 16.8038f, 17.1836f, 16.9616f, 16.3902f)
                curveTo(17.0f, 16.197f, 17.0f, 15.9647f, 17.0f, 15.5f)
                curveTo(17.0f, 15.0353f, 17.0f, 14.803f, 16.9616f, 14.6098f)
                curveTo(16.8038f, 13.8164f, 16.1836f, 13.1962f, 15.3902f, 13.0384f)
                curveTo(15.197f, 13.0f, 14.9647f, 13.0f, 14.5f, 13.0f)
                close()
            }
        }
            .build()
        return _simCardMinimalistic!!
    }

private var _simCardMinimalistic: ImageVector? = null
