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

val ArrowsGroup.ArrowRightUp: ImageVector
    get() {
        if (_arrowRightUp != null) {
            return _arrowRightUp!!
        }
        _arrowRightUp = Builder(
            name = "ArrowRightUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.4697f, 17.4697f)
                curveTo(5.1768f, 17.7626f, 5.1768f, 18.2374f, 5.4697f, 18.5303f)
                curveTo(5.7626f, 18.8232f, 6.2374f, 18.8232f, 6.5303f, 18.5303f)
                lineTo(13.5f, 11.5607f)
                lineTo(17.4697f, 15.5303f)
                curveTo(17.6842f, 15.7448f, 18.0068f, 15.809f, 18.287f, 15.6929f)
                curveTo(18.5673f, 15.5768f, 18.75f, 15.3033f, 18.75f, 15.0f)
                verticalLineTo(6.0f)
                curveTo(18.75f, 5.5858f, 18.4142f, 5.25f, 18.0f, 5.25f)
                lineTo(9.0f, 5.25f)
                curveTo(8.6966f, 5.25f, 8.4232f, 5.4327f, 8.3071f, 5.713f)
                curveTo(8.191f, 5.9932f, 8.2552f, 6.3158f, 8.4697f, 6.5303f)
                lineTo(12.4393f, 10.5f)
                lineTo(5.4697f, 17.4697f)
                close()
            }
        }
            .build()
        return _arrowRightUp!!
    }

private var _arrowRightUp: ImageVector? = null
