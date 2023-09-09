package com.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.AstronomyGroup

public val AstronomyGroup.StarCircle: ImageVector
    get() {
        if (_starCircle != null) {
            return _starCircle!!
        }
        _starCircle = Builder(name = "StarCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.8613f, 9.3633f)
                curveTo(11.3679f, 8.4544f, 11.6213f, 8.0f, 12.0f, 8.0f)
                curveTo(12.3787f, 8.0f, 12.6321f, 8.4544f, 13.1387f, 9.3633f)
                lineTo(13.2698f, 9.5985f)
                curveTo(13.4138f, 9.8568f, 13.4858f, 9.9859f, 13.598f, 10.0711f)
                curveTo(13.7103f, 10.1563f, 13.8501f, 10.188f, 14.1296f, 10.2512f)
                lineTo(14.3842f, 10.3088f)
                curveTo(15.3681f, 10.5314f, 15.86f, 10.6427f, 15.977f, 11.0191f)
                curveTo(16.0941f, 11.3955f, 15.7587f, 11.7876f, 15.088f, 12.572f)
                lineTo(14.9144f, 12.7749f)
                curveTo(14.7238f, 12.9978f, 14.6285f, 13.1092f, 14.5857f, 13.2471f)
                curveTo(14.5428f, 13.385f, 14.5572f, 13.5336f, 14.586f, 13.831f)
                lineTo(14.6122f, 14.1018f)
                curveTo(14.7136f, 15.1482f, 14.7644f, 15.6715f, 14.4579f, 15.9041f)
                curveTo(14.1515f, 16.1367f, 13.6909f, 15.9246f, 12.7697f, 15.5005f)
                lineTo(12.5314f, 15.3907f)
                curveTo(12.2696f, 15.2702f, 12.1387f, 15.2099f, 12.0f, 15.2099f)
                curveTo(11.8613f, 15.2099f, 11.7304f, 15.2702f, 11.4686f, 15.3907f)
                lineTo(11.2303f, 15.5005f)
                curveTo(10.3091f, 15.9246f, 9.8485f, 16.1367f, 9.5421f, 15.9041f)
                curveTo(9.2357f, 15.6715f, 9.2864f, 15.1482f, 9.3878f, 14.1018f)
                lineTo(9.414f, 13.831f)
                curveTo(9.4428f, 13.5336f, 9.4572f, 13.385f, 9.4143f, 13.2471f)
                curveTo(9.3715f, 13.1092f, 9.2762f, 12.9978f, 9.0856f, 12.7749f)
                lineTo(8.912f, 12.572f)
                curveTo(8.2413f, 11.7876f, 7.9059f, 11.3955f, 8.023f, 11.0191f)
                curveTo(8.14f, 10.6427f, 8.6319f, 10.5314f, 9.6158f, 10.3088f)
                lineTo(9.8703f, 10.2512f)
                curveTo(10.1499f, 10.188f, 10.2897f, 10.1563f, 10.402f, 10.0711f)
                curveTo(10.5142f, 9.9859f, 10.5862f, 9.8568f, 10.7302f, 9.5985f)
                lineTo(10.8613f, 9.3633f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.3378f)
                curveTo(8.4709f, 2.487f, 10.1786f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 10.1786f, 2.487f, 8.4709f, 3.3378f, 7.0f)
            }
        }
        .build()
        return _starCircle!!
    }

private var _starCircle: ImageVector? = null
