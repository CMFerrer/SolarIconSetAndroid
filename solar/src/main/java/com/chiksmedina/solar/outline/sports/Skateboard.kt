package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

public val SportsGroup.Skateboard: ImageVector
    get() {
        if (_skateboard != null) {
            return _skateboard!!
        }
        _skateboard = Builder(name = "Skateboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.624f, 6.584f)
                lineTo(3.4366f, 7.8028f)
                curveTo(4.0394f, 8.7069f, 5.0541f, 9.25f, 6.1407f, 9.25f)
                horizontalLineTo(17.8593f)
                curveTo(18.9459f, 9.25f, 19.9607f, 8.7069f, 20.5634f, 7.8028f)
                lineTo(21.376f, 6.584f)
                lineTo(22.6241f, 7.416f)
                lineTo(21.8115f, 8.6348f)
                curveTo(20.9306f, 9.9563f, 19.4475f, 10.75f, 17.8593f, 10.75f)
                horizontalLineTo(6.1407f)
                curveTo(4.5526f, 10.75f, 3.0695f, 9.9563f, 2.1885f, 8.6348f)
                lineTo(1.376f, 7.416f)
                lineTo(2.624f, 6.584f)
                close()
                moveTo(7.0f, 13.75f)
                curveTo(6.3097f, 13.75f, 5.75f, 14.3097f, 5.75f, 15.0f)
                curveTo(5.75f, 15.6904f, 6.3097f, 16.25f, 7.0f, 16.25f)
                curveTo(7.6904f, 16.25f, 8.25f, 15.6904f, 8.25f, 15.0f)
                curveTo(8.25f, 14.3097f, 7.6904f, 13.75f, 7.0f, 13.75f)
                close()
                moveTo(4.25f, 15.0f)
                curveTo(4.25f, 13.4812f, 5.4812f, 12.25f, 7.0f, 12.25f)
                curveTo(8.5188f, 12.25f, 9.75f, 13.4812f, 9.75f, 15.0f)
                curveTo(9.75f, 16.5188f, 8.5188f, 17.75f, 7.0f, 17.75f)
                curveTo(5.4812f, 17.75f, 4.25f, 16.5188f, 4.25f, 15.0f)
                close()
                moveTo(17.0f, 13.75f)
                curveTo(16.3097f, 13.75f, 15.75f, 14.3097f, 15.75f, 15.0f)
                curveTo(15.75f, 15.6904f, 16.3097f, 16.25f, 17.0f, 16.25f)
                curveTo(17.6904f, 16.25f, 18.25f, 15.6904f, 18.25f, 15.0f)
                curveTo(18.25f, 14.3097f, 17.6904f, 13.75f, 17.0f, 13.75f)
                close()
                moveTo(14.25f, 15.0f)
                curveTo(14.25f, 13.4812f, 15.4812f, 12.25f, 17.0f, 12.25f)
                curveTo(18.5188f, 12.25f, 19.75f, 13.4812f, 19.75f, 15.0f)
                curveTo(19.75f, 16.5188f, 18.5188f, 17.75f, 17.0f, 17.75f)
                curveTo(15.4812f, 17.75f, 14.25f, 16.5188f, 14.25f, 15.0f)
                close()
            }
        }
        .build()
        return _skateboard!!
    }

private var _skateboard: ImageVector? = null
