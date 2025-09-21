package dev.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ArrowsActionGroup

val ArrowsActionGroup.CircleBottomDown: ImageVector
    get() {
        if (_circleBottomDown != null) {
            return _circleBottomDown!!
        }
        _circleBottomDown = Builder(
            name = "CircleBottomDown", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.75f, 22.0f)
                curveTo(8.75f, 22.4142f, 8.4142f, 22.75f, 8.0f, 22.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 22.75f, 1.25f, 22.4142f, 1.25f, 22.0f)
                verticalLineTo(16.0f)
                curveTo(1.25f, 15.5858f, 1.5858f, 15.25f, 2.0f, 15.25f)
                curveTo(2.4142f, 15.25f, 2.75f, 15.5858f, 2.75f, 16.0f)
                verticalLineTo(20.1893f)
                lineTo(9.4697f, 13.4697f)
                curveTo(9.7626f, 13.1768f, 10.2374f, 13.1768f, 10.5303f, 13.4697f)
                curveTo(10.8232f, 13.7626f, 10.8232f, 14.2374f, 10.5303f, 14.5303f)
                lineTo(3.8107f, 21.25f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 21.25f, 8.75f, 21.5858f, 8.75f, 22.0f)
                close()
            }
        }
            .build()
        return _circleBottomDown!!
    }

private var _circleBottomDown: ImageVector? = null
