package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.BenzeneRing: ImageVector
    get() {
        if (_benzeneRing != null) {
            return _benzeneRing!!
        }
        _benzeneRing = Builder(
            name = "BenzeneRing", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9792f, 4.8793f)
                curveTo(10.9654f, 4.2931f, 11.4585f, 4.0f, 12.0f, 4.0f)
                curveTo(12.5414f, 4.0f, 13.0345f, 4.2931f, 14.0207f, 4.8793f)
                lineTo(16.9792f, 6.6379f)
                curveTo(17.6847f, 7.0573f, 18.1379f, 7.3266f, 18.4378f, 7.6227f)
                lineTo(21.564f, 5.3897f)
                curveTo(21.9011f, 5.1489f, 22.3695f, 5.227f, 22.6103f, 5.5641f)
                curveTo(22.851f, 5.9011f, 22.7729f, 6.3695f, 22.4359f, 6.6103f)
                lineTo(18.9822f, 9.0772f)
                curveTo(19.0f, 9.391f, 19.0f, 9.7685f, 19.0f, 10.2414f)
                verticalLineTo(13.7586f)
                curveTo(19.0f, 14.931f, 19.0f, 15.5172f, 18.7292f, 16.0f)
                curveTo(18.4585f, 16.4828f, 17.9654f, 16.7759f, 16.9792f, 17.3621f)
                lineTo(14.0207f, 19.1207f)
                curveTo(13.0345f, 19.7069f, 12.5414f, 20.0f, 12.0f, 20.0f)
                curveTo(11.4585f, 20.0f, 10.9654f, 19.7069f, 9.9792f, 19.1207f)
                lineTo(7.0207f, 17.3621f)
                curveTo(6.3848f, 16.9841f, 5.954f, 16.728f, 5.6555f, 16.4643f)
                lineTo(2.416f, 18.624f)
                curveTo(2.0713f, 18.8538f, 1.6057f, 18.7607f, 1.3759f, 18.416f)
                curveTo(1.1462f, 18.0714f, 1.2393f, 17.6057f, 1.5839f, 17.376f)
                lineTo(5.0286f, 15.0795f)
                curveTo(5.0f, 14.7363f, 5.0f, 14.313f, 5.0f, 13.7586f)
                verticalLineTo(10.2414f)
                curveTo(5.0f, 9.687f, 5.0f, 9.2637f, 5.0286f, 8.9205f)
                lineTo(1.5839f, 6.624f)
                curveTo(1.2393f, 6.3943f, 1.1462f, 5.9286f, 1.3759f, 5.584f)
                curveTo(1.6057f, 5.2393f, 2.0713f, 5.1462f, 2.416f, 5.376f)
                lineTo(5.6555f, 7.5357f)
                curveTo(5.954f, 7.272f, 6.3848f, 7.0159f, 7.0207f, 6.6379f)
                lineTo(9.9792f, 4.8793f)
                close()
                moveTo(16.6442f, 14.116f)
                curveTo(16.8563f, 14.4718f, 16.7397f, 14.9322f, 16.3839f, 15.1442f)
                lineTo(12.3839f, 17.5283f)
                curveTo(12.0281f, 17.7404f, 11.5678f, 17.6239f, 11.3557f, 17.268f)
                curveTo(11.1436f, 16.9122f, 11.2602f, 16.4519f, 11.616f, 16.2398f)
                lineTo(15.616f, 13.8558f)
                curveTo(15.9718f, 13.6437f, 16.4321f, 13.7602f, 16.6442f, 14.116f)
                close()
            }
        }
            .build()
        return _benzeneRing!!
    }

private var _benzeneRing: ImageVector? = null
