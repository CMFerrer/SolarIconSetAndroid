package com.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MapLocationGroup

public val MapLocationGroup.Route: ImageVector
    get() {
        if (_route != null) {
            return _route!!
        }
        _route = Builder(name = "Route", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.1421f, 6.1421f)
                curveTo(8.9036f, 3.3807f, 10.2843f, 2.0f, 12.0f, 2.0f)
                curveTo(13.7157f, 2.0f, 15.0964f, 3.3807f, 17.8579f, 6.1421f)
                curveTo(20.6193f, 8.9036f, 22.0f, 10.2843f, 22.0f, 12.0f)
                curveTo(22.0f, 13.7157f, 20.6193f, 15.0964f, 17.8579f, 17.8579f)
                curveTo(15.0964f, 20.6193f, 13.7157f, 22.0f, 12.0f, 22.0f)
                curveTo(10.2843f, 22.0f, 8.9036f, 20.6193f, 6.1421f, 17.8579f)
                curveTo(3.3807f, 15.0964f, 2.0f, 13.7157f, 2.0f, 12.0f)
                curveTo(2.0f, 10.2843f, 3.3807f, 8.9036f, 6.1421f, 6.1421f)
                close()
                moveTo(13.8463f, 8.4529f)
                curveTo(13.5441f, 8.1695f, 13.0695f, 8.1849f, 12.7862f, 8.487f)
                curveTo(12.5029f, 8.7892f, 12.5182f, 9.2639f, 12.8204f, 9.5471f)
                lineTo(14.1034f, 10.75f)
                horizontalLineTo(10.6667f)
                curveTo(10.1116f, 10.75f, 9.2886f, 10.9003f, 8.5804f, 11.3784f)
                curveTo(7.8321f, 11.8835f, 7.25f, 12.7345f, 7.25f, 14.0f)
                curveTo(7.25f, 14.4142f, 7.5858f, 14.75f, 8.0f, 14.75f)
                curveTo(8.4142f, 14.75f, 8.75f, 14.4142f, 8.75f, 14.0f)
                curveTo(8.75f, 13.2655f, 9.0568f, 12.8665f, 9.4196f, 12.6216f)
                curveTo(9.8225f, 12.3497f, 10.3329f, 12.25f, 10.6667f, 12.25f)
                horizontalLineTo(14.1034f)
                lineTo(12.8204f, 13.4528f)
                curveTo(12.5182f, 13.7361f, 12.5029f, 14.2108f, 12.7862f, 14.513f)
                curveTo(13.0695f, 14.8151f, 13.5441f, 14.8305f, 13.8463f, 14.5472f)
                lineTo(16.513f, 12.0472f)
                curveTo(16.6642f, 11.9054f, 16.75f, 11.7073f, 16.75f, 11.5f)
                curveTo(16.75f, 11.2927f, 16.6642f, 11.0946f, 16.513f, 10.9528f)
                lineTo(13.8463f, 8.4529f)
                close()
            }
        }
        .build()
        return _route!!
    }

private var _route: ImageVector? = null
