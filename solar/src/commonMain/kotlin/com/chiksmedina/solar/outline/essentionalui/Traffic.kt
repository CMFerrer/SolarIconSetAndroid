package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Traffic: ImageVector
    get() {
        if (_traffic != null) {
            return _traffic!!
        }
        _traffic = Builder(
            name = "Traffic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.1139f, 21.9317f)
                curveTo(14.1495f, 22.7453f, 11.9881f, 22.9582f, 9.9028f, 22.5434f)
                curveTo(7.8175f, 22.1287f, 5.902f, 21.1048f, 4.3986f, 19.6014f)
                curveTo(2.8952f, 18.098f, 1.8714f, 16.1825f, 1.4566f, 14.0972f)
                curveTo(1.0418f, 12.0119f, 1.2547f, 9.8505f, 2.0683f, 7.8861f)
                curveTo(2.8819f, 5.9219f, 4.2598f, 4.2429f, 6.0276f, 3.0617f)
                curveTo(7.7955f, 1.8805f, 9.8739f, 1.25f, 12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                curveTo(12.75f, 2.4142f, 12.4142f, 2.75f, 12.0f, 2.75f)
                curveTo(10.1705f, 2.75f, 8.3821f, 3.2925f, 6.861f, 4.3089f)
                curveTo(5.3398f, 5.3253f, 4.1542f, 6.77f, 3.4541f, 8.4602f)
                curveTo(2.754f, 10.1504f, 2.5708f, 12.0103f, 2.9277f, 13.8046f)
                curveTo(3.2847f, 15.5989f, 4.1656f, 17.2471f, 5.4593f, 18.5407f)
                curveTo(6.7529f, 19.8344f, 8.4011f, 20.7154f, 10.1954f, 21.0723f)
                curveTo(11.9897f, 21.4292f, 13.8496f, 21.246f, 15.5398f, 20.5459f)
                curveTo(17.23f, 19.8458f, 18.6747f, 18.6602f, 19.6911f, 17.139f)
                curveTo(20.7075f, 15.6179f, 21.25f, 13.8295f, 21.25f, 12.0f)
                curveTo(21.25f, 11.5858f, 21.5858f, 11.25f, 22.0f, 11.25f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 14.1262f, 22.1195f, 16.2046f, 20.9383f, 17.9724f)
                curveTo(19.7571f, 19.7402f, 18.0782f, 21.1181f, 16.1139f, 21.9317f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.6869f, 1.5886f)
                curveTo(14.2858f, 1.4854f, 13.8769f, 1.7269f, 13.7737f, 2.128f)
                curveTo(13.6704f, 2.5291f, 13.9119f, 2.938f, 14.3131f, 3.0413f)
                curveTo(17.5625f, 3.8776f, 20.1223f, 6.4374f, 20.9586f, 9.6868f)
                curveTo(21.0619f, 10.088f, 21.4708f, 10.3295f, 21.8719f, 10.2262f)
                curveTo(22.273f, 10.123f, 22.5145f, 9.7141f, 22.4113f, 9.313f)
                curveTo(21.4387f, 5.5343f, 18.4656f, 2.5612f, 14.6869f, 1.5886f)
                close()
            }
        }
            .build()
        return _traffic!!
    }

private var _traffic: ImageVector? = null
