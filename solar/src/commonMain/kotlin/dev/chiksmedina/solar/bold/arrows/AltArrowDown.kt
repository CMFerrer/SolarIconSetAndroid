package dev.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.AltArrowDown: ImageVector
    get() {
        if (_altArrowDown != null) {
            return _altArrowDown!!
        }
        _altArrowDown = Builder(
            name = "AltArrowDown", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.3704f, 15.8351f)
                lineTo(18.8001f, 9.2047f)
                curveTo(19.2013f, 8.7909f, 18.9581f, 8.0f, 18.4297f, 8.0f)
                horizontalLineTo(5.5703f)
                curveTo(5.0419f, 8.0f, 4.7987f, 8.7909f, 5.1999f, 9.2047f)
                lineTo(11.6296f, 15.8351f)
                curveTo(11.8427f, 16.055f, 12.1573f, 16.0549f, 12.3704f, 15.8351f)
                close()
            }
        }
            .build()
        return _altArrowDown!!
    }

private var _altArrowDown: ImageVector? = null
