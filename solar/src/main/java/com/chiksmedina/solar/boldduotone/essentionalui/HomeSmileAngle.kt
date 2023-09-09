package com.chiksmedina.solar.boldduotone.essentionalui

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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.HomeSmileAngle: ImageVector
    get() {
        if (_homeSmileAngle != null) {
            return _homeSmileAngle!!
        }
        _homeSmileAngle = Builder(name = "HomeSmileAngle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.8939f, 22.0f)
                horizontalLineTo(13.1061f)
                curveTo(16.5526f, 22.0f, 18.2759f, 22.0f, 19.451f, 20.9882f)
                curveTo(20.626f, 19.9764f, 20.8697f, 18.2827f, 21.3572f, 14.8952f)
                lineTo(21.6359f, 12.9579f)
                curveTo(22.0154f, 10.3208f, 22.2051f, 9.0023f, 21.6646f, 7.8749f)
                curveTo(21.1242f, 6.7476f, 19.9738f, 6.0623f, 17.6731f, 4.6918f)
                lineTo(17.6731f, 4.6918f)
                lineTo(16.2882f, 3.8669f)
                curveTo(14.199f, 2.6223f, 13.1543f, 2.0f, 12.0f, 2.0f)
                curveTo(10.8457f, 2.0f, 9.801f, 2.6223f, 7.7118f, 3.8669f)
                lineTo(6.3269f, 4.6918f)
                lineTo(6.3269f, 4.6918f)
                curveTo(4.0262f, 6.0623f, 2.8758f, 6.7476f, 2.3354f, 7.8749f)
                curveTo(1.7949f, 9.0023f, 1.9846f, 10.3208f, 2.3641f, 12.9579f)
                lineTo(2.6428f, 14.8952f)
                curveTo(3.1302f, 18.2827f, 3.374f, 19.9764f, 4.549f, 20.9882f)
                curveTo(5.7241f, 22.0f, 7.4474f, 22.0f, 10.8939f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4467f, 15.397f)
                curveTo(9.1139f, 15.1504f, 8.6442f, 15.2202f, 8.3975f, 15.5529f)
                curveTo(8.1509f, 15.8857f, 8.2207f, 16.3554f, 8.5534f, 16.6021f)
                curveTo(9.5259f, 17.3229f, 10.7151f, 17.7496f, 12.0f, 17.7496f)
                curveTo(13.285f, 17.7496f, 14.4742f, 17.3229f, 15.4467f, 16.6021f)
                curveTo(15.7794f, 16.3554f, 15.8492f, 15.8857f, 15.6026f, 15.5529f)
                curveTo(15.3559f, 15.2202f, 14.8862f, 15.1504f, 14.5534f, 15.397f)
                curveTo(13.8251f, 15.9369f, 12.9459f, 16.2496f, 12.0f, 16.2496f)
                curveTo(11.0541f, 16.2496f, 10.175f, 15.9369f, 9.4467f, 15.397f)
                close()
            }
        }
        .build()
        return _homeSmileAngle!!
    }

private var _homeSmileAngle: ImageVector? = null
