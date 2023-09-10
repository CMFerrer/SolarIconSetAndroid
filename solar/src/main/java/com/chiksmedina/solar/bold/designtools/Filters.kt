package com.chiksmedina.solar.bold.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(
            name = "Filters", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 8.0f)
                curveTo(18.0f, 11.3137f, 15.3137f, 14.0f, 12.0f, 14.0f)
                curveTo(8.6863f, 14.0f, 6.0f, 11.3137f, 6.0f, 8.0f)
                curveTo(6.0f, 4.6863f, 8.6863f, 2.0f, 12.0f, 2.0f)
                curveTo(15.3137f, 2.0f, 18.0f, 4.6863f, 18.0f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0335f, 10.7837f)
                curveTo(3.2216f, 11.8163f, 2.0f, 13.7656f, 2.0f, 16.0002f)
                curveTo(2.0f, 19.3139f, 4.6863f, 22.0002f, 8.0f, 22.0002f)
                curveTo(11.3137f, 22.0002f, 14.0f, 19.3139f, 14.0f, 16.0002f)
                curveTo(14.0f, 15.7439f, 13.9839f, 15.4913f, 13.9527f, 15.2435f)
                curveTo(13.3301f, 15.4109f, 12.6755f, 15.5002f, 12.0f, 15.5002f)
                curveTo(8.8414f, 15.5002f, 6.1388f, 13.5477f, 5.0335f, 10.7837f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.3866f, 14.6939f)
                curveTo(15.4611f, 15.1181f, 15.5f, 15.5546f, 15.5f, 16.0002f)
                curveTo(15.5f, 18.0909f, 14.6446f, 19.9817f, 13.2646f, 21.3419f)
                curveTo(14.0849f, 21.7627f, 15.0147f, 22.0002f, 16.0f, 22.0002f)
                curveTo(19.3137f, 22.0002f, 22.0f, 19.3139f, 22.0f, 16.0002f)
                curveTo(22.0f, 13.7656f, 20.7783f, 11.8163f, 18.9665f, 10.7837f)
                curveTo(18.2876f, 12.4813f, 17.0062f, 13.8728f, 15.3866f, 14.6939f)
                close()
            }
        }
            .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
