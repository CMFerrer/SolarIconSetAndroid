package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.9999f, 12.0f)
                curveTo(21.9999f, 6.4771f, 17.5227f, 2.0f, 11.9999f, 2.0f)
                curveTo(6.477f, 2.0f, 1.9999f, 6.4771f, 1.9999f, 12.0f)
                curveTo(1.9999f, 17.5228f, 6.477f, 22.0f, 11.9999f, 22.0f)
                curveTo(17.5227f, 22.0f, 21.9999f, 17.5228f, 21.9999f, 12.0f)
                close()
                moveTo(8.4696f, 11.5303f)
                curveTo(8.1767f, 11.2374f, 8.1767f, 10.7626f, 8.4696f, 10.4697f)
                lineTo(11.4695f, 7.4697f)
                curveTo(11.7624f, 7.1768f, 12.2373f, 7.1768f, 12.5302f, 7.4697f)
                lineTo(15.5302f, 10.4697f)
                curveTo(15.8231f, 10.7626f, 15.8231f, 11.2374f, 15.5302f, 11.5303f)
                curveTo(15.2373f, 11.8232f, 14.7624f, 11.8232f, 14.4695f, 11.5303f)
                lineTo(12.7499f, 9.8107f)
                verticalLineTo(16.0f)
                curveTo(12.7499f, 16.4142f, 12.4141f, 16.75f, 11.9999f, 16.75f)
                curveTo(11.5857f, 16.75f, 11.2499f, 16.4142f, 11.2499f, 16.0f)
                verticalLineTo(9.8107f)
                lineTo(9.5302f, 11.5303f)
                curveTo(9.2373f, 11.8232f, 8.7624f, 11.8232f, 8.4696f, 11.5303f)
                close()
            }
        }
            .build()
        return _roundArrowUp!!
    }

private var _roundArrowUp: ImageVector? = null
