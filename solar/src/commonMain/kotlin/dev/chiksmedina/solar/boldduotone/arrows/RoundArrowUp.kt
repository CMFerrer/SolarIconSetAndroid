package dev.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.RoundArrowUp: ImageVector
    get() {
        if (_roundArrowUp != null) {
            return _roundArrowUp!!
        }
        _roundArrowUp = Builder(
            name = "RoundArrowUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5303f, 10.4697f)
                curveTo(15.8232f, 10.7626f, 15.8232f, 11.2374f, 15.5303f, 11.5303f)
                curveTo(15.2374f, 11.8232f, 14.7626f, 11.8232f, 14.4697f, 11.5303f)
                lineTo(12.75f, 9.8107f)
                lineTo(12.75f, 16.0f)
                curveTo(12.75f, 16.4142f, 12.4142f, 16.75f, 12.0f, 16.75f)
                curveTo(11.5858f, 16.75f, 11.25f, 16.4142f, 11.25f, 16.0f)
                lineTo(11.25f, 9.8107f)
                lineTo(9.5303f, 11.5303f)
                curveTo(9.2374f, 11.8232f, 8.7626f, 11.8232f, 8.4697f, 11.5303f)
                curveTo(8.1768f, 11.2374f, 8.1768f, 10.7626f, 8.4697f, 10.4697f)
                lineTo(11.4697f, 7.4697f)
                curveTo(11.7626f, 7.1768f, 12.2374f, 7.1768f, 12.5303f, 7.4697f)
                lineTo(15.5303f, 10.4697f)
                close()
            }
        }
            .build()
        return _roundArrowUp!!
    }

private var _roundArrowUp: ImageVector? = null
