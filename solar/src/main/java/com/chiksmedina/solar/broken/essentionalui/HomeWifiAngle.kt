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

val EssentionalUiGroup.HomeWifiAngle: ImageVector
    get() {
        if (_homeWifiAngle != null) {
            return _homeWifiAngle!!
        }
        _homeWifiAngle = Builder(
            name = "HomeWifiAngle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.6359f, 12.9581f)
                lineTo(21.3572f, 14.8954f)
                curveTo(20.8697f, 18.2828f, 20.626f, 19.9766f, 19.451f, 20.9884f)
                curveTo(18.2759f, 22.0002f, 16.5526f, 22.0002f, 13.1061f, 22.0002f)
                horizontalLineTo(10.8939f)
                curveTo(7.4474f, 22.0002f, 5.7241f, 22.0002f, 4.549f, 20.9884f)
                curveTo(3.374f, 19.9766f, 3.1302f, 18.2828f, 2.6428f, 14.8954f)
                lineTo(2.3641f, 12.958f)
                curveTo(1.9846f, 10.321f, 1.7949f, 9.0025f, 2.3354f, 7.8751f)
                curveTo(2.8758f, 6.7478f, 4.0262f, 6.0625f, 6.3269f, 4.692f)
                lineTo(7.7118f, 3.867f)
                curveTo(9.801f, 2.6225f, 10.8457f, 2.0002f, 12.0f, 2.0002f)
                curveTo(13.1543f, 2.0002f, 14.199f, 2.6225f, 16.2882f, 3.867f)
                lineTo(17.6731f, 4.692f)
                curveTo(19.9738f, 6.0625f, 21.1242f, 6.7478f, 21.6646f, 7.8751f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 11.6825f)
                curveTo(9.3137f, 8.1058f, 14.6863f, 8.1058f, 18.0f, 11.6825f)
                moveTo(8.0f, 13.841f)
                curveTo(10.2092f, 11.4566f, 13.7909f, 11.4566f, 16.0f, 13.841f)
                moveTo(10.0f, 16.0f)
                curveTo(11.1046f, 14.8078f, 12.8955f, 14.8078f, 14.0f, 16.0f)
            }
        }
            .build()
        return _homeWifiAngle!!
    }

private var _homeWifiAngle: ImageVector? = null
