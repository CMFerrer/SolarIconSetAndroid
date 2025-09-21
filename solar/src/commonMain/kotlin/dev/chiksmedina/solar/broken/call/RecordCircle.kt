package dev.chiksmedina.solar.broken.call

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
import dev.chiksmedina.solar.broken.CallGroup

val CallGroup.RecordCircle: ImageVector
    get() {
        if (_recordCircle != null) {
            return _recordCircle!!
        }
        _recordCircle = Builder(
            name = "RecordCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.5002f, 11.9999f)
                curveTo(18.5002f, 13.3807f, 17.381f, 14.4999f, 16.0002f, 14.4999f)
                curveTo(14.6195f, 14.4999f, 13.5002f, 13.3807f, 13.5002f, 11.9999f)
                curveTo(13.5002f, 10.6192f, 14.6195f, 9.4999f, 16.0002f, 9.4999f)
                curveTo(17.381f, 9.4999f, 18.5002f, 10.6192f, 18.5002f, 11.9999f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 12.0f)
                curveTo(10.5f, 13.3807f, 9.3807f, 14.5f, 8.0f, 14.5f)
                curveTo(6.6193f, 14.5f, 5.5f, 13.3807f, 5.5f, 12.0f)
                curveTo(5.5f, 10.6193f, 6.6193f, 9.5f, 8.0f, 9.5f)
                curveTo(9.3807f, 9.5f, 10.5f, 10.6193f, 10.5f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 14.5f)
                horizontalLineTo(16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 3.3378f)
                curveTo(8.4709f, 2.487f, 10.1786f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 10.1786f, 2.487f, 8.4709f, 3.3378f, 7.0f)
            }
        }
            .build()
        return _recordCircle!!
    }

private var _recordCircle: ImageVector? = null
