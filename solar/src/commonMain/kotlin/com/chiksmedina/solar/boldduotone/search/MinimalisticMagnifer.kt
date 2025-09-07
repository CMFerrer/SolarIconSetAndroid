package com.chiksmedina.solar.boldduotone.search

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SearchGroup

val SearchGroup.MinimalisticMagnifer: ImageVector
    get() {
        if (_minimalisticMagnifer != null) {
            return _minimalisticMagnifer!!
        }
        _minimalisticMagnifer = Builder(
            name = "MinimalisticMagnifer", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.3133f, 11.1566f)
                curveTo(20.3133f, 16.2137f, 16.2137f, 20.3133f, 11.1566f, 20.3133f)
                curveTo(6.0996f, 20.3133f, 2.0f, 16.2137f, 2.0f, 11.1566f)
                curveTo(2.0f, 6.0996f, 6.0996f, 2.0f, 11.1566f, 2.0f)
                curveTo(16.2137f, 2.0f, 20.3133f, 6.0996f, 20.3133f, 11.1566f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.8387f, 18.8387f)
                curveTo(19.121f, 18.5564f, 19.5787f, 18.5564f, 19.861f, 18.8387f)
                lineTo(21.7887f, 20.7664f)
                curveTo(22.071f, 21.0487f, 22.071f, 21.5064f, 21.7887f, 21.7887f)
                curveTo(21.5064f, 22.071f, 21.0487f, 22.071f, 20.7664f, 21.7887f)
                lineTo(18.8387f, 19.861f)
                curveTo(18.5564f, 19.5787f, 18.5564f, 19.121f, 18.8387f, 18.8387f)
                close()
            }
        }
            .build()
        return _minimalisticMagnifer!!
    }

private var _minimalisticMagnifer: ImageVector? = null
