package com.chiksmedina.solar.bold.search

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SearchGroup

public val SearchGroup.MagniferZoomIn: ImageVector
    get() {
        if (_magniferZoomIn != null) {
            return _magniferZoomIn!!
        }
        _magniferZoomIn = Builder(name = "MagniferZoomIn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.7883f, 21.7883f)
                curveTo(22.0706f, 21.506f, 22.0706f, 21.0483f, 21.7883f, 20.7659f)
                lineTo(18.1224f, 17.1001f)
                curveTo(19.4885f, 15.5006f, 20.3133f, 13.4249f, 20.3133f, 11.1566f)
                curveTo(20.3133f, 6.0996f, 16.2137f, 2.0f, 11.1566f, 2.0f)
                curveTo(6.0996f, 2.0f, 2.0f, 6.0996f, 2.0f, 11.1566f)
                curveTo(2.0f, 16.2137f, 6.0996f, 20.3133f, 11.1566f, 20.3133f)
                curveTo(13.4249f, 20.3133f, 15.5006f, 19.4885f, 17.1001f, 18.1224f)
                lineTo(20.7659f, 21.7883f)
                curveTo(21.0483f, 22.0706f, 21.506f, 22.0706f, 21.7883f, 21.7883f)
                close()
                moveTo(11.1566f, 8.0241f)
                curveTo(11.5559f, 8.0241f, 11.8795f, 8.3477f, 11.8795f, 8.747f)
                verticalLineTo(10.4337f)
                horizontalLineTo(13.5663f)
                curveTo(13.9655f, 10.4337f, 14.2892f, 10.7574f, 14.2892f, 11.1566f)
                curveTo(14.2892f, 11.5559f, 13.9655f, 11.8795f, 13.5663f, 11.8795f)
                horizontalLineTo(11.8795f)
                verticalLineTo(13.5663f)
                curveTo(11.8795f, 13.9655f, 11.5559f, 14.2892f, 11.1566f, 14.2892f)
                curveTo(10.7574f, 14.2892f, 10.4337f, 13.9655f, 10.4337f, 13.5663f)
                verticalLineTo(11.8795f)
                horizontalLineTo(8.747f)
                curveTo(8.3477f, 11.8795f, 8.0241f, 11.5559f, 8.0241f, 11.1566f)
                curveTo(8.0241f, 10.7574f, 8.3477f, 10.4337f, 8.747f, 10.4337f)
                horizontalLineTo(10.4337f)
                verticalLineTo(8.747f)
                curveTo(10.4337f, 8.3477f, 10.7574f, 8.0241f, 11.1566f, 8.0241f)
                close()
            }
        }
        .build()
        return _magniferZoomIn!!
    }

private var _magniferZoomIn: ImageVector? = null
