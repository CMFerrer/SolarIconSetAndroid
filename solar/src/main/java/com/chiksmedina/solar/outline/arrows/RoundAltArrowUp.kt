package com.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsGroup

public val ArrowsGroup.RoundAltArrowUp: ImageVector
    get() {
        if (_roundAltArrowUp != null) {
            return _roundAltArrowUp!!
        }
        _roundAltArrowUp = Builder(name = "RoundAltArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(8.4697f, 12.9697f)
                lineTo(11.4697f, 9.9697f)
                curveTo(11.7626f, 9.6768f, 12.2374f, 9.6768f, 12.5303f, 9.9697f)
                lineTo(15.5303f, 12.9697f)
                curveTo(15.8232f, 13.2626f, 15.8232f, 13.7374f, 15.5303f, 14.0303f)
                curveTo(15.2374f, 14.3232f, 14.7626f, 14.3232f, 14.4697f, 14.0303f)
                lineTo(12.0f, 11.5607f)
                lineTo(9.5303f, 14.0303f)
                curveTo(9.2374f, 14.3232f, 8.7626f, 14.3232f, 8.4697f, 14.0303f)
                curveTo(8.1768f, 13.7374f, 8.1768f, 13.2626f, 8.4697f, 12.9697f)
                close()
            }
        }
        .build()
        return _roundAltArrowUp!!
    }

private var _roundAltArrowUp: ImageVector? = null
