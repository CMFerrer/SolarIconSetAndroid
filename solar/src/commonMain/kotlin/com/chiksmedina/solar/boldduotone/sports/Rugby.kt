package com.chiksmedina.solar.boldduotone.sports

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
import com.chiksmedina.solar.boldduotone.SportsGroup

val SportsGroup.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(
            name = "Rugby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.4573f, 2.1099f)
                curveTo(10.5739f, 2.3873f, 7.5095f, 3.252f, 5.3808f, 5.3808f)
                curveTo(3.252f, 7.5095f, 2.3873f, 10.5739f, 2.1099f, 13.4573f)
                lineTo(10.5429f, 21.8903f)
                curveTo(13.4263f, 21.6129f, 16.4907f, 20.7483f, 18.6195f, 18.6195f)
                curveTo(20.7483f, 16.4907f, 21.6129f, 13.4263f, 21.8903f, 10.5429f)
                lineTo(13.4573f, 2.1099f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0686f, 2.0872f)
                curveTo(16.7367f, 1.9854f, 15.1273f, 1.9491f, 13.4572f, 2.1098f)
                lineTo(21.8902f, 10.5428f)
                curveTo(22.0509f, 8.8727f, 22.0146f, 7.2633f, 21.9127f, 5.9314f)
                curveTo(21.7537f, 3.8517f, 20.1483f, 2.2463f, 18.0686f, 2.0872f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.9314f, 21.9127f)
                curveTo(7.2633f, 22.0146f, 8.8727f, 22.0509f, 10.5428f, 21.8902f)
                lineTo(2.1098f, 13.4572f)
                curveTo(1.9491f, 15.1273f, 1.9854f, 16.7367f, 2.0872f, 18.0686f)
                curveTo(2.2463f, 20.1483f, 3.8517f, 21.7537f, 5.9314f, 21.9127f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 8.1601f)
                curveTo(12.2355f, 7.8672f, 12.7104f, 7.8672f, 13.0032f, 8.1601f)
                lineTo(13.8914f, 9.0482f)
                lineTo(14.7795f, 8.1601f)
                curveTo(15.0724f, 7.8672f, 15.5472f, 7.8672f, 15.8401f, 8.1601f)
                curveTo(16.133f, 8.453f, 16.133f, 8.9279f, 15.8401f, 9.2208f)
                lineTo(14.952f, 10.1089f)
                lineTo(15.8401f, 10.997f)
                curveTo(16.133f, 11.2899f, 16.133f, 11.7647f, 15.8401f, 12.0576f)
                curveTo(15.5472f, 12.3505f, 15.0724f, 12.3505f, 14.7795f, 12.0576f)
                lineTo(13.8914f, 11.1695f)
                lineTo(13.0608f, 12.0001f)
                lineTo(13.9489f, 12.8882f)
                curveTo(14.2418f, 13.1811f, 14.2418f, 13.656f, 13.9489f, 13.9489f)
                curveTo(13.656f, 14.2418f, 13.1811f, 14.2418f, 12.8882f, 13.9489f)
                lineTo(12.0001f, 13.0608f)
                lineTo(11.1695f, 13.8914f)
                lineTo(12.0576f, 14.7795f)
                curveTo(12.3505f, 15.0723f, 12.3505f, 15.5472f, 12.0576f, 15.8401f)
                curveTo(11.7647f, 16.133f, 11.2899f, 16.133f, 10.997f, 15.8401f)
                lineTo(10.1089f, 14.952f)
                lineTo(9.2208f, 15.8401f)
                curveTo(8.9279f, 16.133f, 8.453f, 16.133f, 8.1601f, 15.8401f)
                curveTo(7.8672f, 15.5472f, 7.8672f, 15.0723f, 8.1601f, 14.7795f)
                lineTo(9.0482f, 13.8914f)
                lineTo(8.1601f, 13.0032f)
                curveTo(7.8672f, 12.7104f, 7.8672f, 12.2355f, 8.1601f, 11.9426f)
                curveTo(8.453f, 11.6497f, 8.9279f, 11.6497f, 9.2208f, 11.9426f)
                lineTo(10.1089f, 12.8307f)
                lineTo(10.9394f, 12.0001f)
                lineTo(10.0513f, 11.112f)
                curveTo(9.7584f, 10.8191f, 9.7584f, 10.3442f, 10.0513f, 10.0513f)
                curveTo(10.3442f, 9.7584f, 10.8191f, 9.7584f, 11.112f, 10.0513f)
                lineTo(12.0001f, 10.9394f)
                lineTo(12.8307f, 10.1089f)
                lineTo(11.9426f, 9.2208f)
                curveTo(11.6497f, 8.9279f, 11.6497f, 8.453f, 11.9426f, 8.1601f)
                close()
            }
        }
            .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null
