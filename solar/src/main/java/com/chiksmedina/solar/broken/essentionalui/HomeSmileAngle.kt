package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.HomeSmileAngle: ImageVector
    get() {
        if (_homeSmileAngle != null) {
            return _homeSmileAngle!!
        }
        _homeSmileAngle = Builder(
            name = "HomeSmileAngle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 16.0f)
                curveTo(9.8504f, 16.6303f, 10.8846f, 17.0f, 12.0f, 17.0f)
                curveTo(13.1154f, 17.0f, 14.1496f, 16.6303f, 15.0f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.6359f, 12.9581f)
                lineTo(21.3572f, 14.8955f)
                curveTo(20.8697f, 18.2829f, 20.626f, 19.9766f, 19.451f, 20.9884f)
                curveTo(18.2759f, 22.0002f, 16.5526f, 22.0002f, 13.1061f, 22.0002f)
                horizontalLineTo(10.8939f)
                curveTo(7.4474f, 22.0002f, 5.7241f, 22.0002f, 4.549f, 20.9884f)
                curveTo(3.374f, 19.9766f, 3.1302f, 18.2829f, 2.6428f, 14.8955f)
                lineTo(2.3641f, 12.9581f)
                curveTo(1.9846f, 10.3211f, 1.7949f, 9.0025f, 2.3354f, 7.8752f)
                curveTo(2.8758f, 6.7478f, 4.0262f, 6.0626f, 6.3269f, 4.692f)
                lineTo(7.7118f, 3.8671f)
                curveTo(9.801f, 2.6225f, 10.8457f, 2.0002f, 12.0f, 2.0002f)
                curveTo(13.1543f, 2.0002f, 14.199f, 2.6225f, 16.2882f, 3.8671f)
                lineTo(17.6731f, 4.692f)
                curveTo(19.9738f, 6.0626f, 21.1242f, 6.7478f, 21.6646f, 7.8752f)
            }
        }
            .build()
        return _homeSmileAngle!!
    }

private var _homeSmileAngle: ImageVector? = null
