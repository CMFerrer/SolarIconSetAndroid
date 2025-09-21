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

val ArrowsGroup.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = Builder(
            name = "ArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 20.0f)
                curveTo(12.75f, 20.4142f, 12.4142f, 20.75f, 12.0f, 20.75f)
                curveTo(11.5858f, 20.75f, 11.25f, 20.4142f, 11.25f, 20.0f)
                lineTo(11.25f, 10.75f)
                horizontalLineTo(6.0f)
                curveTo(5.6967f, 10.75f, 5.4232f, 10.5673f, 5.3071f, 10.287f)
                curveTo(5.191f, 10.0068f, 5.2552f, 9.6842f, 5.4697f, 9.4697f)
                lineTo(11.4697f, 3.4697f)
                curveTo(11.6103f, 3.329f, 11.8011f, 3.25f, 12.0f, 3.25f)
                curveTo(12.1989f, 3.25f, 12.3897f, 3.329f, 12.5304f, 3.4697f)
                lineTo(18.5304f, 9.4697f)
                curveTo(18.7449f, 9.6842f, 18.809f, 10.0068f, 18.6929f, 10.287f)
                curveTo(18.5768f, 10.5673f, 18.3034f, 10.75f, 18.0f, 10.75f)
                horizontalLineTo(12.75f)
                lineTo(12.75f, 20.0f)
                close()
            }
        }
            .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
