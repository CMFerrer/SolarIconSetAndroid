package com.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.WeatherGroup

val WeatherGroup.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(
            name = "Stars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.3357f, 3.3827f)
                curveTo(7.9313f, 1.8724f, 10.0687f, 1.8724f, 10.6643f, 3.3827f)
                lineTo(11.7363f, 6.1008f)
                curveTo(11.7657f, 6.1753f, 11.8247f, 6.2343f, 11.8992f, 6.2637f)
                lineTo(14.6173f, 7.3357f)
                curveTo(16.1276f, 7.9313f, 16.1276f, 10.0687f, 14.6173f, 10.6643f)
                lineTo(11.8992f, 11.7363f)
                curveTo(11.8247f, 11.7657f, 11.7657f, 11.8247f, 11.7363f, 11.8992f)
                lineTo(10.6643f, 14.6173f)
                curveTo(10.0687f, 16.1276f, 7.9313f, 16.1276f, 7.3357f, 14.6173f)
                lineTo(6.2637f, 11.8992f)
                curveTo(6.2343f, 11.8247f, 6.1753f, 11.7657f, 6.1008f, 11.7363f)
                lineTo(3.3827f, 10.6643f)
                curveTo(1.8724f, 10.0687f, 1.8724f, 7.9313f, 3.3827f, 7.3357f)
                lineTo(6.1008f, 6.2637f)
                curveTo(6.1753f, 6.2343f, 6.2343f, 6.1753f, 6.2637f, 6.1008f)
                lineTo(7.3357f, 3.3827f)
                close()
                moveTo(9.2689f, 3.933f)
                curveTo(9.1727f, 3.689f, 8.8273f, 3.689f, 8.7311f, 3.933f)
                lineTo(7.6591f, 6.6512f)
                curveTo(7.4772f, 7.1122f, 7.1122f, 7.4772f, 6.6512f, 7.6591f)
                lineTo(3.933f, 8.7311f)
                curveTo(3.689f, 8.8273f, 3.689f, 9.1727f, 3.933f, 9.2689f)
                lineTo(6.6512f, 10.3409f)
                curveTo(7.1122f, 10.5228f, 7.4772f, 10.8878f, 7.6591f, 11.3488f)
                lineTo(8.7311f, 14.067f)
                curveTo(8.8273f, 14.311f, 9.1727f, 14.311f, 9.2689f, 14.067f)
                lineTo(10.3409f, 11.3488f)
                curveTo(10.5228f, 10.8878f, 10.8878f, 10.5228f, 11.3488f, 10.3409f)
                lineTo(14.067f, 9.2689f)
                curveTo(14.311f, 9.1727f, 14.311f, 8.8273f, 14.067f, 8.7311f)
                lineTo(11.3488f, 7.6591f)
                curveTo(10.8878f, 7.4772f, 10.5228f, 7.1122f, 10.3409f, 6.6512f)
                lineTo(9.2689f, 3.933f)
                close()
                moveTo(15.7908f, 13.073f)
                curveTo(16.2235f, 11.9757f, 17.7765f, 11.9757f, 18.2092f, 13.073f)
                lineTo(18.9779f, 15.0221f)
                lineTo(20.927f, 15.7908f)
                curveTo(22.0243f, 16.2235f, 22.0243f, 17.7765f, 20.927f, 18.2092f)
                lineTo(18.9779f, 18.9779f)
                lineTo(18.2092f, 20.927f)
                curveTo(17.7765f, 22.0243f, 16.2235f, 22.0243f, 15.7908f, 20.927f)
                lineTo(15.0221f, 18.9779f)
                lineTo(13.073f, 18.2092f)
                curveTo(11.9757f, 17.7765f, 11.9757f, 16.2235f, 13.073f, 15.7908f)
                lineTo(15.0221f, 15.0221f)
                lineTo(15.7908f, 13.073f)
                close()
                moveTo(17.0f, 14.0953f)
                lineTo(16.3856f, 15.6533f)
                curveTo(16.2534f, 15.9883f, 15.9883f, 16.2534f, 15.6533f, 16.3856f)
                lineTo(14.0953f, 17.0f)
                lineTo(15.6533f, 17.6144f)
                curveTo(15.9883f, 17.7466f, 16.2534f, 18.0117f, 16.3856f, 18.3467f)
                lineTo(17.0f, 19.9047f)
                lineTo(17.6144f, 18.3467f)
                curveTo(17.7466f, 18.0117f, 18.0117f, 17.7466f, 18.3467f, 17.6144f)
                lineTo(19.9047f, 17.0f)
                lineTo(18.3467f, 16.3856f)
                curveTo(18.0117f, 16.2534f, 17.7466f, 15.9883f, 17.6144f, 15.6533f)
                lineTo(17.0f, 14.0953f)
                close()
            }
        }
            .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
