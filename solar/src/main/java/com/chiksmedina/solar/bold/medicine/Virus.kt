package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.bold.MedicineGroup

public val MedicineGroup.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(name = "Virus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 5.5f)
                curveTo(20.0f, 6.3284f, 19.3284f, 7.0f, 18.5f, 7.0f)
                curveTo(18.3656f, 7.0f, 18.2354f, 6.9823f, 18.1115f, 6.9492f)
                lineTo(17.4803f, 7.5804f)
                curveTo(17.4574f, 7.6032f, 17.4334f, 7.6243f, 17.4085f, 7.6436f)
                curveTo(18.0785f, 8.4686f, 18.5683f, 9.445f, 18.8165f, 10.5111f)
                curveTo(18.8766f, 10.5038f, 18.9379f, 10.5f, 19.0f, 10.5f)
                curveTo(19.8284f, 10.5f, 20.5f, 11.1716f, 20.5f, 12.0f)
                curveTo(20.5f, 12.8284f, 19.8284f, 13.5f, 19.0f, 13.5f)
                horizontalLineTo(18.8622f)
                curveTo(18.5921f, 14.8364f, 17.9434f, 16.0239f, 17.0246f, 16.9541f)
                lineTo(18.1613f, 18.1006f)
                curveTo(18.2852f, 18.0675f, 18.4154f, 18.0498f, 18.5498f, 18.0498f)
                curveTo(19.3782f, 18.0498f, 20.0498f, 18.7214f, 20.0498f, 19.5498f)
                curveTo(20.0498f, 20.3782f, 19.3782f, 21.0498f, 18.5498f, 21.0498f)
                curveTo(17.7214f, 21.0498f, 17.0498f, 20.3782f, 17.0498f, 19.5498f)
                curveTo(17.0498f, 19.4154f, 17.0675f, 19.2852f, 17.1006f, 19.1613f)
                lineTo(15.9697f, 18.0303f)
                curveTo(15.9291f, 17.9897f, 15.8941f, 17.9456f, 15.8647f, 17.899f)
                curveTo(15.3931f, 18.2042f, 14.8813f, 18.4532f, 14.3385f, 18.6367f)
                lineTo(14.1218f, 19.2499f)
                curveTo(13.8133f, 20.1228f, 12.9809f, 20.75f, 12.0f, 20.75f)
                curveTo(11.0191f, 20.75f, 10.1867f, 20.1228f, 9.8782f, 19.2499f)
                lineTo(9.6308f, 18.5498f)
                curveTo(9.1359f, 18.3638f, 8.6667f, 18.1241f, 8.2305f, 17.8377f)
                lineTo(6.854f, 19.2485f)
                curveTo(6.9482f, 19.4805f, 7.0f, 19.7342f, 7.0f, 20.0f)
                curveTo(7.0f, 21.1046f, 6.1046f, 22.0f, 5.0f, 22.0f)
                curveTo(3.8954f, 22.0f, 3.0f, 21.1046f, 3.0f, 20.0f)
                curveTo(3.0f, 18.8954f, 3.8954f, 18.0f, 5.0f, 18.0f)
                curveTo(5.2883f, 18.0f, 5.5623f, 18.061f, 5.8098f, 18.1707f)
                lineTo(7.0651f, 16.8842f)
                curveTo(6.2668f, 16.078f, 5.6585f, 15.0833f, 5.3153f, 13.9753f)
                curveTo(5.2126f, 13.9916f, 5.1073f, 14.0f, 5.0f, 14.0f)
                curveTo(3.8954f, 14.0f, 3.0f, 13.1046f, 3.0f, 12.0f)
                curveTo(3.0f, 10.8954f, 3.8954f, 10.0f, 5.0f, 10.0f)
                curveTo(5.0861f, 10.0f, 5.1708f, 10.0054f, 5.254f, 10.016f)
                curveTo(5.5065f, 9.1103f, 5.9383f, 8.2815f, 6.5092f, 7.5698f)
                lineTo(5.7811f, 6.8417f)
                curveTo(5.5412f, 6.9436f, 5.2772f, 7.0f, 5.0f, 7.0f)
                curveTo(3.8954f, 7.0f, 3.0f, 6.1046f, 3.0f, 5.0f)
                curveTo(3.0f, 3.8954f, 3.8954f, 3.0f, 5.0f, 3.0f)
                curveTo(6.1046f, 3.0f, 7.0f, 3.8954f, 7.0f, 5.0f)
                curveTo(7.0f, 5.2771f, 6.9436f, 5.541f, 6.8418f, 5.781f)
                lineTo(7.5699f, 6.5091f)
                curveTo(8.5941f, 5.6876f, 9.8607f, 5.1542f, 11.25f, 5.0286f)
                verticalLineTo(4.7993f)
                curveTo(10.8016f, 4.54f, 10.5f, 4.0552f, 10.5f, 3.5f)
                curveTo(10.5f, 2.6716f, 11.1716f, 2.0f, 12.0f, 2.0f)
                curveTo(12.8284f, 2.0f, 13.5f, 2.6716f, 13.5f, 3.5f)
                curveTo(13.5f, 4.0552f, 13.1984f, 4.54f, 12.75f, 4.7993f)
                verticalLineTo(5.0526f)
                curveTo(14.1042f, 5.2187f, 15.3442f, 5.7695f, 16.3564f, 6.5915f)
                curveTo(16.3757f, 6.5666f, 16.3968f, 6.5426f, 16.4196f, 6.5197f)
                lineTo(17.0508f, 5.8885f)
                curveTo(17.0177f, 5.7646f, 17.0f, 5.6344f, 17.0f, 5.5f)
                curveTo(17.0f, 4.6716f, 17.6716f, 4.0f, 18.5f, 4.0f)
                curveTo(19.3284f, 4.0f, 20.0f, 4.6716f, 20.0f, 5.5f)
                close()
                moveTo(11.75f, 13.0f)
                curveTo(11.75f, 11.4812f, 12.9812f, 10.25f, 14.5f, 10.25f)
                curveTo(16.0188f, 10.25f, 17.25f, 11.4812f, 17.25f, 13.0f)
                curveTo(17.25f, 14.5188f, 16.0188f, 15.75f, 14.5f, 15.75f)
                curveTo(12.9812f, 15.75f, 11.75f, 14.5188f, 11.75f, 13.0f)
                close()
                moveTo(10.5f, 10.0f)
                curveTo(11.3284f, 10.0f, 12.0f, 9.3284f, 12.0f, 8.5f)
                curveTo(12.0f, 8.442f, 11.9967f, 8.3847f, 11.9903f, 8.3284f)
                curveTo(11.9354f, 7.8459f, 11.6515f, 7.4329f, 11.25f, 7.2007f)
                curveTo(11.0294f, 7.0731f, 10.7732f, 7.0f, 10.5f, 7.0f)
                curveTo(9.6716f, 7.0f, 9.0f, 7.6716f, 9.0f, 8.5f)
                curveTo(9.0f, 9.3284f, 9.6716f, 10.0f, 10.5f, 10.0f)
                close()
                moveTo(9.0f, 14.0f)
                curveTo(9.5523f, 14.0f, 10.0f, 13.5523f, 10.0f, 13.0f)
                curveTo(10.0f, 12.4477f, 9.5523f, 12.0f, 9.0f, 12.0f)
                curveTo(8.4477f, 12.0f, 8.0f, 12.4477f, 8.0f, 13.0f)
                curveTo(8.0f, 13.5523f, 8.4477f, 14.0f, 9.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 13.0f)
                curveTo(13.25f, 12.3096f, 13.8096f, 11.75f, 14.5f, 11.75f)
                curveTo(15.1904f, 11.75f, 15.75f, 12.3096f, 15.75f, 13.0f)
                curveTo(15.75f, 13.6904f, 15.1904f, 14.25f, 14.5f, 14.25f)
                curveTo(13.8096f, 14.25f, 13.25f, 13.6904f, 13.25f, 13.0f)
                close()
            }
        }
        .build()
        return _virus!!
    }

private var _virus: ImageVector? = null
