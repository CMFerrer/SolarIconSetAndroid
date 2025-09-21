package dev.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ArrowsActionGroup

val ArrowsActionGroup.CircleBottomUp: ImageVector
    get() {
        if (_circleBottomUp != null) {
            return _circleBottomUp!!
        }
        _circleBottomUp = Builder(
            name = "CircleBottomUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(11.5858f, 21.25f, 11.25f, 21.5858f, 11.25f, 22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 12.4142f, 1.5858f, 12.75f, 2.0f, 12.75f)
                curveTo(2.4142f, 12.75f, 2.75f, 12.4142f, 2.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 12.25f)
                curveTo(4.5858f, 12.25f, 4.25f, 12.5858f, 4.25f, 13.0f)
                curveTo(4.25f, 13.4142f, 4.5858f, 13.75f, 5.0f, 13.75f)
                horizontalLineTo(9.1893f)
                lineTo(2.4697f, 20.4697f)
                curveTo(2.1768f, 20.7626f, 2.1768f, 21.2374f, 2.4697f, 21.5303f)
                curveTo(2.7626f, 21.8232f, 3.2374f, 21.8232f, 3.5303f, 21.5303f)
                lineTo(10.25f, 14.8107f)
                verticalLineTo(19.0f)
                curveTo(10.25f, 19.4142f, 10.5858f, 19.75f, 11.0f, 19.75f)
                curveTo(11.4142f, 19.75f, 11.75f, 19.4142f, 11.75f, 19.0f)
                verticalLineTo(13.0f)
                curveTo(11.75f, 12.5858f, 11.4142f, 12.25f, 11.0f, 12.25f)
                horizontalLineTo(5.0f)
                close()
            }
        }
            .build()
        return _circleBottomUp!!
    }

private var _circleBottomUp: ImageVector? = null
