package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsGroup

public val ArrowsGroup.RoundAltArrowUp: ImageVector
    get() {
        if (_roundAltArrowUp != null) {
            return _roundAltArrowUp!!
        }
        _roundAltArrowUp = Builder(name = "RoundAltArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9998f, 12.0f)
                curveTo(21.9998f, 6.4771f, 17.5226f, 2.0f, 11.9998f, 2.0f)
                curveTo(6.4769f, 2.0f, 1.9998f, 6.4771f, 1.9998f, 12.0f)
                curveTo(1.9998f, 17.5228f, 6.4769f, 22.0f, 11.9998f, 22.0f)
                curveTo(17.5226f, 22.0f, 21.9998f, 17.5228f, 21.9998f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4694f, 12.9697f)
                curveTo(8.1765f, 13.2626f, 8.1765f, 13.7374f, 8.4694f, 14.0303f)
                curveTo(8.7623f, 14.3232f, 9.2372f, 14.3232f, 9.5301f, 14.0303f)
                lineTo(11.9998f, 11.5607f)
                lineTo(14.4694f, 14.0303f)
                curveTo(14.7623f, 14.3232f, 15.2372f, 14.3232f, 15.5301f, 14.0303f)
                curveTo(15.823f, 13.7374f, 15.823f, 13.2626f, 15.5301f, 12.9697f)
                lineTo(12.5301f, 9.9697f)
                curveTo(12.2372f, 9.6768f, 11.7623f, 9.6768f, 11.4694f, 9.9697f)
                lineTo(8.4694f, 12.9697f)
                close()
            }
        }
        .build()
        return _roundAltArrowUp!!
    }

private var _roundAltArrowUp: ImageVector? = null
