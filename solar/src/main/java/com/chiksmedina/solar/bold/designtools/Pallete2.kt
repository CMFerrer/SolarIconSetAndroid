package com.chiksmedina.solar.bold.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.Pallete2: ImageVector
    get() {
        if (_pallete2 != null) {
            return _pallete2!!
        }
        _pallete2 = Builder(
            name = "Pallete2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.8468f, 21.9342f)
                curveTo(5.8671f, 21.3624f, 2.0f, 17.1328f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.1565f, 18.7173f, 16.7325f, 15.9135f, 16.3703f)
                curveTo(14.2964f, 16.1614f, 12.8386f, 15.9731f, 12.2619f, 16.888f)
                curveTo(11.8674f, 17.5136f, 12.2938f, 18.2938f, 12.8168f, 18.8168f)
                curveTo(13.4703f, 19.4703f, 13.4703f, 20.5297f, 12.8168f, 21.1832f)
                curveTo(12.2938f, 21.7062f, 11.5816f, 22.0186f, 10.8468f, 21.9342f)
                close()
                moveTo(11.085f, 6.9998f)
                curveTo(11.085f, 7.8282f, 10.4134f, 8.4998f, 9.585f, 8.4998f)
                curveTo(8.7566f, 8.4998f, 8.085f, 7.8282f, 8.085f, 6.9998f)
                curveTo(8.085f, 6.1713f, 8.7566f, 5.4998f, 9.585f, 5.4998f)
                curveTo(10.4134f, 5.4998f, 11.085f, 6.1713f, 11.085f, 6.9998f)
                close()
                moveTo(6.5f, 13.0f)
                curveTo(7.3284f, 13.0f, 8.0f, 12.3284f, 8.0f, 11.5f)
                curveTo(8.0f, 10.6716f, 7.3284f, 10.0f, 6.5f, 10.0f)
                curveTo(5.6716f, 10.0f, 5.0f, 10.6716f, 5.0f, 11.5f)
                curveTo(5.0f, 12.3284f, 5.6716f, 13.0f, 6.5f, 13.0f)
                close()
                moveTo(17.5f, 13.0f)
                curveTo(18.3284f, 13.0f, 19.0f, 12.3284f, 19.0f, 11.5f)
                curveTo(19.0f, 10.6716f, 18.3284f, 10.0f, 17.5f, 10.0f)
                curveTo(16.6716f, 10.0f, 16.0f, 10.6716f, 16.0f, 11.5f)
                curveTo(16.0f, 12.3284f, 16.6716f, 13.0f, 17.5f, 13.0f)
                close()
                moveTo(14.5f, 8.5f)
                curveTo(15.3284f, 8.5f, 16.0f, 7.8284f, 16.0f, 7.0f)
                curveTo(16.0f, 6.1716f, 15.3284f, 5.5f, 14.5f, 5.5f)
                curveTo(13.6716f, 5.5f, 13.0f, 6.1716f, 13.0f, 7.0f)
                curveTo(13.0f, 7.8284f, 13.6716f, 8.5f, 14.5f, 8.5f)
                close()
            }
        }
            .build()
        return _pallete2!!
    }

private var _pallete2: ImageVector? = null
