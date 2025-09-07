package com.chiksmedina.solar.lineduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.AstronomyGroup

val AstronomyGroup.StarFallMinimalistic: ImageVector
    get() {
        if (_starFallMinimalistic != null) {
            return _starFallMinimalistic!!
        }
        _starFallMinimalistic = Builder(
            name = "StarFallMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.7249f, 8.1561f)
                curveTo(16.2754f, 7.2379f, 17.0507f, 6.7788f, 17.6201f, 7.1045f)
                curveTo(18.1895f, 7.4303f, 18.1759f, 8.3252f, 18.1487f, 10.115f)
                lineTo(18.1416f, 10.578f)
                curveTo(18.1339f, 11.0866f, 18.13f, 11.3409f, 18.2248f, 11.5644f)
                curveTo(18.3196f, 11.7878f, 18.5023f, 11.9552f, 18.8677f, 12.2899f)
                lineTo(19.2003f, 12.5946f)
                curveTo(20.4862f, 13.7725f, 21.1291f, 14.3614f, 20.9784f, 15.0228f)
                curveTo(20.8277f, 15.6841f, 19.9831f, 15.9799f, 18.2941f, 16.5714f)
                lineTo(17.8571f, 16.7245f)
                curveTo(17.3771f, 16.8926f, 17.1371f, 16.9766f, 16.953f, 17.1451f)
                curveTo(16.7689f, 17.3137f, 16.6615f, 17.5475f, 16.4467f, 18.0153f)
                lineTo(16.2512f, 18.4412f)
                curveTo(15.4953f, 20.0874f, 15.1174f, 20.9105f, 14.4549f, 20.9935f)
                curveTo(13.7924f, 21.0765f, 13.284f, 20.3644f, 12.2673f, 18.9402f)
                lineTo(12.0043f, 18.5717f)
                curveTo(11.7154f, 18.167f, 11.5709f, 17.9647f, 11.3623f, 17.8453f)
                curveTo(11.1538f, 17.726f, 10.9047f, 17.7032f, 10.4065f, 17.6576f)
                lineTo(9.953f, 17.6161f)
                curveTo(8.2001f, 17.4557f, 7.3236f, 17.3754f, 7.0648f, 16.7654f)
                curveTo(6.8061f, 16.1553f, 7.3364f, 15.4194f, 8.3972f, 13.9477f)
                lineTo(8.6716f, 13.5669f)
                curveTo(8.973f, 13.1487f, 9.1237f, 12.9396f, 9.1789f, 12.6973f)
                curveTo(9.2341f, 12.4551f, 9.1876f, 12.2071f, 9.0945f, 11.7111f)
                lineTo(9.0098f, 11.2596f)
                curveTo(8.6822f, 9.5142f, 8.5184f, 8.6415f, 9.021f, 8.1815f)
                curveTo(9.5236f, 7.7215f, 10.3598f, 7.9788f, 12.032f, 8.4934f)
                lineTo(12.4647f, 8.6265f)
                curveTo(12.9399f, 8.7728f, 13.1775f, 8.8459f, 13.4202f, 8.8155f)
                curveTo(13.6629f, 8.7851f, 13.8832f, 8.6546f, 14.3238f, 8.3937f)
                lineTo(14.7249f, 8.1561f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 6.5f)
                lineTo(13.0f, 6.0f)
                moveTo(9.5f, 2.5f)
                lineTo(11.5f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5f, 6.5f)
                lineTo(4.0f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 12.0f)
                lineTo(4.5f, 10.5f)
                moveTo(2.0f, 8.0f)
                lineTo(2.5f, 8.5f)
            }
        }
            .build()
        return _starFallMinimalistic!!
    }

private var _starFallMinimalistic: ImageVector? = null
