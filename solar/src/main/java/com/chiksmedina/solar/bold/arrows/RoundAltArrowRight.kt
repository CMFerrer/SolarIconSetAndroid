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

public val ArrowsGroup.RoundAltArrowRight: ImageVector
    get() {
        if (_roundAltArrowRight != null) {
            return _roundAltArrowRight!!
        }
        _roundAltArrowRight = Builder(name = "RoundAltArrowRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(9.9697f, 8.4697f)
                curveTo(10.2626f, 8.1768f, 10.7374f, 8.1768f, 11.0303f, 8.4697f)
                lineTo(14.0303f, 11.4697f)
                curveTo(14.3232f, 11.7626f, 14.3232f, 12.2374f, 14.0303f, 12.5303f)
                lineTo(11.0303f, 15.5303f)
                curveTo(10.7374f, 15.8232f, 10.2626f, 15.8232f, 9.9697f, 15.5303f)
                curveTo(9.6768f, 15.2374f, 9.6768f, 14.7626f, 9.9697f, 14.4697f)
                lineTo(12.4393f, 12.0f)
                lineTo(9.9697f, 9.5303f)
                curveTo(9.6768f, 9.2374f, 9.6768f, 8.7626f, 9.9697f, 8.4697f)
                close()
            }
        }
        .build()
        return _roundAltArrowRight!!
    }

private var _roundAltArrowRight: ImageVector? = null
