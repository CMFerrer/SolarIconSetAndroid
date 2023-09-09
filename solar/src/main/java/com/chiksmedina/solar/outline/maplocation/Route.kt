package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

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
                moveTo(9.9181f, 3.6318f)
                curveTo(9.0627f, 4.2845f, 8.0682f, 5.2768f, 6.6725f, 6.6725f)
                curveTo(5.2768f, 8.0682f, 4.2845f, 9.0627f, 3.6318f, 9.9181f)
                curveTo(2.9924f, 10.7562f, 2.75f, 11.3721f, 2.75f, 12.0f)
                curveTo(2.75f, 12.6279f, 2.9924f, 13.2438f, 3.6318f, 14.0819f)
                curveTo(4.2845f, 14.9373f, 5.2768f, 15.9318f, 6.6725f, 17.3275f)
                curveTo(8.0682f, 18.7232f, 9.0627f, 19.7155f, 9.9181f, 20.3682f)
                curveTo(10.7562f, 21.0077f, 11.3721f, 21.25f, 12.0f, 21.25f)
                curveTo(12.6279f, 21.25f, 13.2438f, 21.0077f, 14.0819f, 20.3682f)
                curveTo(14.9373f, 19.7155f, 15.9318f, 18.7232f, 17.3275f, 17.3275f)
                curveTo(18.7232f, 15.9318f, 19.7155f, 14.9373f, 20.3682f, 14.0819f)
                curveTo(21.0077f, 13.2438f, 21.25f, 12.6279f, 21.25f, 12.0f)
                curveTo(21.25f, 11.3721f, 21.0077f, 10.7562f, 20.3682f, 9.9181f)
                curveTo(19.7155f, 9.0627f, 18.7232f, 8.0682f, 17.3275f, 6.6725f)
                curveTo(15.9318f, 5.2768f, 14.9373f, 4.2845f, 14.0819f, 3.6318f)
                curveTo(13.2438f, 2.9924f, 12.6279f, 2.75f, 12.0f, 2.75f)
                curveTo(11.3721f, 2.75f, 10.7562f, 2.9924f, 9.9181f, 3.6318f)
                close()
                moveTo(9.0083f, 2.4393f)
                curveTo(9.9798f, 1.698f, 10.9122f, 1.25f, 12.0f, 1.25f)
                curveTo(13.0878f, 1.25f, 14.0202f, 1.698f, 14.9917f, 2.4393f)
                curveTo(15.9366f, 3.1602f, 17.0014f, 4.225f, 18.3482f, 5.5718f)
                lineTo(18.4282f, 5.6518f)
                curveTo(19.775f, 6.9986f, 20.8398f, 8.0634f, 21.5607f, 9.0083f)
                curveTo(22.302f, 9.9798f, 22.75f, 10.9122f, 22.75f, 12.0f)
                curveTo(22.75f, 13.0878f, 22.302f, 14.0202f, 21.5607f, 14.9917f)
                curveTo(20.8398f, 15.9366f, 19.775f, 17.0014f, 18.4282f, 18.3482f)
                lineTo(18.3482f, 18.4282f)
                curveTo(17.0014f, 19.775f, 15.9366f, 20.8398f, 14.9917f, 21.5607f)
                curveTo(14.0202f, 22.302f, 13.0878f, 22.75f, 12.0f, 22.75f)
                curveTo(10.9122f, 22.75f, 9.9798f, 22.302f, 9.0083f, 21.5607f)
                curveTo(8.0634f, 20.8398f, 6.9986f, 19.775f, 5.6518f, 18.4282f)
                lineTo(5.5718f, 18.3482f)
                curveTo(4.225f, 17.0014f, 3.1602f, 15.9366f, 2.4393f, 14.9917f)
                curveTo(1.698f, 14.0202f, 1.25f, 13.0878f, 1.25f, 12.0f)
                curveTo(1.25f, 10.9122f, 1.698f, 9.9798f, 2.4393f, 9.0083f)
                curveTo(3.1602f, 8.0634f, 4.225f, 6.9986f, 5.5718f, 5.6518f)
                lineTo(5.6518f, 5.5718f)
                curveTo(6.9986f, 4.225f, 8.0634f, 3.1602f, 9.0083f, 2.4393f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.7862f, 8.487f)
                curveTo(13.0695f, 8.1849f, 13.5441f, 8.1695f, 13.8463f, 8.4529f)
                lineTo(16.513f, 10.9528f)
                curveTo(16.6642f, 11.0946f, 16.75f, 11.2927f, 16.75f, 11.5f)
                curveTo(16.75f, 11.7073f, 16.6642f, 11.9054f, 16.513f, 12.0472f)
                lineTo(13.8463f, 14.5472f)
                curveTo(13.5441f, 14.8305f, 13.0695f, 14.8151f, 12.7862f, 14.513f)
                curveTo(12.5029f, 14.2108f, 12.5182f, 13.7361f, 12.8204f, 13.4528f)
                lineTo(14.1034f, 12.25f)
                horizontalLineTo(10.6667f)
                curveTo(10.3329f, 12.25f, 9.8225f, 12.3497f, 9.4196f, 12.6216f)
                curveTo(9.0568f, 12.8665f, 8.75f, 13.2655f, 8.75f, 14.0f)
                curveTo(8.75f, 14.4142f, 8.4142f, 14.75f, 8.0f, 14.75f)
                curveTo(7.5858f, 14.75f, 7.25f, 14.4142f, 7.25f, 14.0f)
                curveTo(7.25f, 12.7345f, 7.8321f, 11.8835f, 8.5804f, 11.3784f)
                curveTo(9.2886f, 10.9003f, 10.1116f, 10.75f, 10.6667f, 10.75f)
                horizontalLineTo(14.1034f)
                lineTo(12.8204f, 9.5471f)
                curveTo(12.5182f, 9.2639f, 12.5029f, 8.7892f, 12.7862f, 8.487f)
                close()
            }
        }
        .build()
        return _route!!
    }

private var _route: ImageVector? = null
