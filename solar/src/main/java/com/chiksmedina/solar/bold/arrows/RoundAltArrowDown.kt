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

val ArrowsGroup.RoundAltArrowDown: ImageVector
    get() {
        if (_roundAltArrowDown != null) {
            return _roundAltArrowDown!!
        }
        _roundAltArrowDown = Builder(
            name = "RoundAltArrowDown", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(15.5303f, 9.9697f)
                curveTo(15.8232f, 10.2626f, 15.8232f, 10.7374f, 15.5303f, 11.0303f)
                lineTo(12.5303f, 14.0303f)
                curveTo(12.3897f, 14.171f, 12.1989f, 14.25f, 12.0f, 14.25f)
                curveTo(11.8011f, 14.25f, 11.6103f, 14.171f, 11.4697f, 14.0303f)
                lineTo(8.4697f, 11.0303f)
                curveTo(8.1768f, 10.7374f, 8.1768f, 10.2626f, 8.4697f, 9.9697f)
                curveTo(8.7626f, 9.6768f, 9.2374f, 9.6768f, 9.5303f, 9.9697f)
                lineTo(12.0f, 12.4393f)
                lineTo(14.4697f, 9.9697f)
                curveTo(14.7626f, 9.6768f, 15.2374f, 9.6768f, 15.5303f, 9.9697f)
                close()
            }
        }
            .build()
        return _roundAltArrowDown!!
    }

private var _roundAltArrowDown: ImageVector? = null
