package com.chiksmedina.solar.outline.medicine

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
import com.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.Pills: ImageVector
    get() {
        if (_pills != null) {
            return _pills!!
        }
        _pills = Builder(
            name = "Pills", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.4697f, 4.4697f)
                curveTo(12.7626f, 4.1768f, 13.2374f, 4.1768f, 13.5303f, 4.4697f)
                lineTo(15.0303f, 5.9697f)
                curveTo(15.3232f, 6.2626f, 15.3232f, 6.7374f, 15.0303f, 7.0303f)
                curveTo(14.7374f, 7.3232f, 14.2626f, 7.3232f, 13.9697f, 7.0303f)
                lineTo(12.4697f, 5.5303f)
                curveTo(12.1768f, 5.2374f, 12.1768f, 4.7626f, 12.4697f, 4.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.0621f, 3.0621f)
                curveTo(9.4783f, 0.646f, 13.3957f, 0.646f, 15.8118f, 3.0621f)
                lineTo(20.9379f, 8.1882f)
                curveTo(23.354f, 10.6043f, 23.354f, 14.5217f, 20.9379f, 16.9379f)
                curveTo(19.1526f, 18.7231f, 16.5477f, 19.1893f, 14.3345f, 18.3364f)
                curveTo(13.3838f, 20.9127f, 10.9071f, 22.7499f, 8.0f, 22.7499f)
                curveTo(4.2721f, 22.7499f, 1.25f, 19.7278f, 1.25f, 15.9999f)
                curveTo(1.25f, 13.0927f, 3.0873f, 10.6161f, 5.6636f, 9.6654f)
                curveTo(4.8107f, 7.4522f, 5.2769f, 4.8474f, 7.0621f, 3.0621f)
                close()
                moveTo(14.7512f, 4.1228f)
                curveTo(12.9208f, 2.2924f, 9.9532f, 2.2924f, 8.1228f, 4.1228f)
                curveTo(6.2924f, 5.9532f, 6.2924f, 8.9208f, 8.1228f, 10.7512f)
                lineTo(10.3759f, 13.0042f)
                curveTo(10.5925f, 12.9324f, 10.8966f, 12.8171f, 11.2652f, 12.6395f)
                curveTo(12.0708f, 12.2513f, 13.1874f, 11.5639f, 14.3754f, 10.3758f)
                curveTo(15.5635f, 9.1877f, 16.251f, 8.0711f, 16.6393f, 7.2654f)
                curveTo(16.817f, 6.8967f, 16.9323f, 6.5925f, 17.0042f, 6.3758f)
                lineTo(14.7512f, 4.1228f)
                close()
                moveTo(18.1644f, 7.536f)
                curveTo(18.1126f, 7.656f, 18.0549f, 7.7831f, 17.9906f, 7.9166f)
                curveTo(17.536f, 8.8597f, 16.7542f, 10.1184f, 15.4361f, 11.4365f)
                curveTo(14.118f, 12.7545f, 12.8594f, 13.5363f, 11.9164f, 13.9908f)
                curveTo(11.783f, 14.055f, 11.656f, 14.1127f, 11.5361f, 14.1645f)
                lineTo(13.2488f, 15.8772f)
                curveTo(15.0792f, 17.7076f, 18.0468f, 17.7076f, 19.8772f, 15.8772f)
                curveTo(21.7076f, 14.0468f, 21.7076f, 11.0792f, 19.8772f, 9.2488f)
                lineTo(18.1644f, 7.536f)
                close()
                moveTo(6.3807f, 11.0042f)
                curveTo(4.2735f, 11.6866f, 2.75f, 13.6661f, 2.75f, 15.9999f)
                curveTo(2.75f, 18.8994f, 5.1005f, 21.2499f, 8.0f, 21.2499f)
                curveTo(10.3339f, 21.2499f, 12.3133f, 19.7264f, 12.9957f, 17.6193f)
                curveTo(12.7123f, 17.4188f, 12.4419f, 17.1917f, 12.1882f, 16.9379f)
                lineTo(7.0621f, 11.8118f)
                curveTo(6.8083f, 11.558f, 6.5812f, 11.2876f, 6.3807f, 11.0042f)
                close()
            }
        }
            .build()
        return _pills!!
    }

private var _pills: ImageVector? = null
