package dev.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.RoundArrowLeftUp: ImageVector
    get() {
        if (_roundArrowLeftUp != null) {
            return _roundArrowLeftUp!!
        }
        _roundArrowLeftUp = Builder(
            name = "RoundArrowLeftUp", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(14.25f, 9.0f)
                curveTo(14.25f, 8.5858f, 13.9142f, 8.25f, 13.5f, 8.25f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 8.25f, 8.25f, 8.5858f, 8.25f, 9.0f)
                verticalLineTo(13.5f)
                curveTo(8.25f, 13.9142f, 8.5858f, 14.25f, 9.0f, 14.25f)
                curveTo(9.4142f, 14.25f, 9.75f, 13.9142f, 9.75f, 13.5f)
                verticalLineTo(10.8107f)
                lineTo(14.4697f, 15.5303f)
                curveTo(14.7626f, 15.8232f, 15.2374f, 15.8232f, 15.5303f, 15.5303f)
                curveTo(15.8232f, 15.2374f, 15.8232f, 14.7626f, 15.5303f, 14.4697f)
                lineTo(10.8107f, 9.75f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 9.75f, 14.25f, 9.4142f, 14.25f, 9.0f)
                close()
            }
        }
            .build()
        return _roundArrowLeftUp!!
    }

private var _roundArrowLeftUp: ImageVector? = null
