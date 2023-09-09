package com.chiksmedina.solar.lineduotone.essentionalui

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
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.BoltCircle: ImageVector
    get() {
        if (_boltCircle != null) {
            return _boltCircle!!
        }
        _boltCircle = Builder(name = "BoltCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.2125f, 10.1735f)
                lineTo(11.2275f, 8.5688f)
                curveTo(12.5301f, 7.5316f, 13.1813f, 7.013f, 13.5907f, 7.2691f)
                curveTo(14.0f, 7.5253f, 13.7875f, 8.3185f, 13.3624f, 9.9048f)
                lineTo(13.3223f, 10.0544f)
                curveTo(13.169f, 10.6266f, 13.0923f, 10.9126f, 13.2271f, 11.1411f)
                lineTo(13.2343f, 11.153f)
                curveTo(13.374f, 11.3787f, 13.6717f, 11.4584f, 14.2672f, 11.618f)
                curveTo(15.3389f, 11.9051f, 15.8747f, 12.0487f, 15.9687f, 12.4222f)
                curveTo(15.9702f, 12.4284f, 15.9717f, 12.4346f, 15.9731f, 12.4409f)
                curveTo(16.0556f, 12.8167f, 15.6329f, 13.1533f, 14.7874f, 13.8266f)
                lineTo(12.7724f, 15.4312f)
                curveTo(11.4698f, 16.4684f, 10.8186f, 16.9871f, 10.4092f, 16.7309f)
                curveTo(9.9999f, 16.4748f, 10.2125f, 15.6816f, 10.6375f, 14.0952f)
                lineTo(10.6776f, 13.9457f)
                curveTo(10.8309f, 13.3735f, 10.9076f, 13.0874f, 10.7729f, 12.859f)
                lineTo(10.7657f, 12.8471f)
                curveTo(10.626f, 12.6214f, 10.3282f, 12.5416f, 9.7327f, 12.3821f)
                curveTo(8.6611f, 12.0949f, 8.1253f, 11.9514f, 8.0313f, 11.5778f)
                curveTo(8.0297f, 11.5716f, 8.0282f, 11.5654f, 8.0269f, 11.5592f)
                curveTo(7.9444f, 11.1834f, 8.3671f, 10.8468f, 9.2125f, 10.1735f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _boltCircle!!
    }

private var _boltCircle: ImageVector? = null
