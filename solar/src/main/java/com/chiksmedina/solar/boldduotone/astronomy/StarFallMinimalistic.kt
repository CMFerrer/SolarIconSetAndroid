package com.chiksmedina.solar.boldduotone.astronomy

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
import com.chiksmedina.solar.boldduotone.AstronomyGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.7249f, 8.1561f)
                curveTo(16.2754f, 7.2379f, 17.0507f, 6.7788f, 17.6201f, 7.1045f)
                curveTo(18.1895f, 7.4303f, 18.1758f, 8.3252f, 18.1486f, 10.115f)
                lineTo(18.1416f, 10.578f)
                curveTo(18.1339f, 11.0866f, 18.13f, 11.3409f, 18.2248f, 11.5644f)
                curveTo(18.3196f, 11.7878f, 18.5023f, 11.9552f, 18.8677f, 12.2899f)
                lineTo(19.2003f, 12.5946f)
                curveTo(20.4862f, 13.7725f, 21.1291f, 14.3614f, 20.9784f, 15.0228f)
                curveTo(20.8277f, 15.6841f, 19.9831f, 15.9799f, 18.2941f, 16.5714f)
                lineTo(17.8571f, 16.7245f)
                curveTo(17.3771f, 16.8926f, 17.1371f, 16.9766f, 16.953f, 17.1451f)
                curveTo(16.7689f, 17.3137f, 16.6615f, 17.5476f, 16.4467f, 18.0153f)
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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(8.9697f, 1.9697f)
                curveTo(9.2626f, 1.6768f, 9.7374f, 1.6768f, 10.0303f, 1.9697f)
                lineTo(12.0303f, 3.9697f)
                curveTo(12.3232f, 4.2626f, 12.3232f, 4.7374f, 12.0303f, 5.0303f)
                curveTo(11.7374f, 5.3232f, 11.2626f, 5.3232f, 10.9697f, 5.0303f)
                lineTo(8.9697f, 3.0303f)
                curveTo(8.6768f, 2.7374f, 8.6768f, 2.2626f, 8.9697f, 1.9697f)
                close()
                moveTo(3.4697f, 3.4697f)
                curveTo(3.7626f, 3.1768f, 4.2374f, 3.1768f, 4.5303f, 3.4697f)
                lineTo(7.0303f, 5.9697f)
                curveTo(7.3232f, 6.2626f, 7.3232f, 6.7374f, 7.0303f, 7.0303f)
                curveTo(6.7374f, 7.3232f, 6.2626f, 7.3232f, 5.9697f, 7.0303f)
                lineTo(3.4697f, 4.5303f)
                curveTo(3.1768f, 4.2374f, 3.1768f, 3.7626f, 3.4697f, 3.4697f)
                close()
                moveTo(12.4697f, 5.4697f)
                curveTo(12.7626f, 5.1768f, 13.2374f, 5.1768f, 13.5303f, 5.4697f)
                lineTo(14.0303f, 5.9697f)
                curveTo(14.3232f, 6.2626f, 14.3232f, 6.7374f, 14.0303f, 7.0303f)
                curveTo(13.7374f, 7.3232f, 13.2626f, 7.3232f, 12.9697f, 7.0303f)
                lineTo(12.4697f, 6.5303f)
                curveTo(12.1768f, 6.2374f, 12.1768f, 5.7626f, 12.4697f, 5.4697f)
                close()
                moveTo(1.4697f, 7.4697f)
                curveTo(1.7626f, 7.1768f, 2.2374f, 7.1768f, 2.5303f, 7.4697f)
                lineTo(3.0303f, 7.9697f)
                curveTo(3.3232f, 8.2626f, 3.3232f, 8.7374f, 3.0303f, 9.0303f)
                curveTo(2.7374f, 9.3232f, 2.2626f, 9.3232f, 1.9697f, 9.0303f)
                lineTo(1.4697f, 8.5303f)
                curveTo(1.1768f, 8.2374f, 1.1768f, 7.7626f, 1.4697f, 7.4697f)
                close()
                moveTo(3.9697f, 9.9697f)
                curveTo(4.2626f, 9.6768f, 4.7374f, 9.6768f, 5.0303f, 9.9697f)
                lineTo(6.5303f, 11.4697f)
                curveTo(6.8232f, 11.7626f, 6.8232f, 12.2374f, 6.5303f, 12.5303f)
                curveTo(6.2374f, 12.8232f, 5.7626f, 12.8232f, 5.4697f, 12.5303f)
                lineTo(3.9697f, 11.0303f)
                curveTo(3.6768f, 10.7374f, 3.6768f, 10.2626f, 3.9697f, 9.9697f)
                close()
            }
        }
            .build()
        return _starFallMinimalistic!!
    }

private var _starFallMinimalistic: ImageVector? = null
