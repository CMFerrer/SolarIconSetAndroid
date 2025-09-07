package com.chiksmedina.solar.linear.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.BusinessStatisticGroup

val BusinessStatisticGroup.PieChart2: ImageVector
    get() {
        if (_pieChart2 != null) {
            return _pieChart2!!
        }
        _pieChart2 = Builder(
            name = "PieChart2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.2221f, 4.601f)
                curveTo(6.6666f, 4.304f, 7.1334f, 4.0464f, 7.6171f, 3.8298f)
                curveTo(8.989f, 3.2154f, 9.6749f, 2.9082f, 10.5875f, 3.4994f)
                curveTo(11.5f, 4.0906f, 11.5f, 5.0604f, 11.5f, 7.0f)
                verticalLineTo(8.5f)
                curveTo(11.5f, 10.3856f, 11.5f, 11.3284f, 12.0858f, 11.9142f)
                curveTo(12.6716f, 12.5f, 13.6144f, 12.5f, 15.5f, 12.5f)
                horizontalLineTo(17.0f)
                curveTo(18.9396f, 12.5f, 19.9094f, 12.5f, 20.5006f, 13.4125f)
                curveTo(21.0918f, 14.3251f, 20.7846f, 15.011f, 20.1702f, 16.3829f)
                curveTo(19.9536f, 16.8666f, 19.696f, 17.3334f, 19.399f, 17.7779f)
                curveTo(18.3551f, 19.3402f, 16.8714f, 20.5578f, 15.1355f, 21.2769f)
                curveTo(13.3996f, 21.9959f, 11.4895f, 22.184f, 9.6467f, 21.8175f)
                curveTo(7.8038f, 21.4509f, 6.1111f, 20.5461f, 4.7825f, 19.2175f)
                curveTo(3.4539f, 17.8889f, 2.5491f, 16.1962f, 2.1825f, 14.3534f)
                curveTo(1.816f, 12.5105f, 2.0041f, 10.6004f, 2.7232f, 8.8645f)
                curveTo(3.4422f, 7.1286f, 4.6598f, 5.6449f, 6.2221f, 4.601f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.446f, 7.069f)
                curveTo(20.6342f, 5.0083f, 18.9917f, 3.3658f, 16.931f, 2.554f)
                curveTo(15.3895f, 1.9467f, 14.0f, 3.3432f, 14.0f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(14.0f, 9.5523f, 14.4477f, 10.0f, 15.0f, 10.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 10.0f, 22.0533f, 8.6105f, 21.446f, 7.069f)
                close()
            }
        }
            .build()
        return _pieChart2!!
    }

private var _pieChart2: ImageVector? = null
