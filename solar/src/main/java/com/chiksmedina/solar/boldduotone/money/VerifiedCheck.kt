package com.chiksmedina.solar.boldduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MoneyGroup

val MoneyGroup.VerifiedCheck: ImageVector
    get() {
        if (_verifiedCheck != null) {
            return _verifiedCheck!!
        }
        _verifiedCheck = Builder(
            name = "VerifiedCheck", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5924f, 3.2003f)
                curveTo(9.3489f, 3.4078f, 9.2271f, 3.5116f, 9.0971f, 3.5987f)
                curveTo(8.799f, 3.7985f, 8.4642f, 3.9372f, 8.1121f, 4.0067f)
                curveTo(7.9585f, 4.037f, 7.799f, 4.0498f, 7.4801f, 4.0752f)
                lineTo(7.4801f, 4.0752f)
                curveTo(6.6787f, 4.1392f, 6.278f, 4.1712f, 5.9437f, 4.2892f)
                curveTo(5.1705f, 4.5623f, 4.5623f, 5.1705f, 4.2892f, 5.9437f)
                curveTo(4.1712f, 6.278f, 4.1392f, 6.6787f, 4.0752f, 7.4801f)
                lineTo(4.0752f, 7.4801f)
                curveTo(4.0498f, 7.799f, 4.037f, 7.9585f, 4.0067f, 8.1121f)
                curveTo(3.9372f, 8.4642f, 3.7985f, 8.799f, 3.5987f, 9.0971f)
                curveTo(3.5116f, 9.2271f, 3.4078f, 9.3489f, 3.2003f, 9.5924f)
                lineTo(3.2003f, 9.5924f)
                curveTo(2.6788f, 10.2043f, 2.4181f, 10.5102f, 2.2652f, 10.8301f)
                curveTo(1.9116f, 11.57f, 1.9116f, 12.43f, 2.2652f, 13.1699f)
                curveTo(2.4181f, 13.4898f, 2.6788f, 13.7957f, 3.2003f, 14.4076f)
                lineTo(3.2003f, 14.4076f)
                curveTo(3.4078f, 14.6511f, 3.5116f, 14.7729f, 3.5987f, 14.9029f)
                curveTo(3.7985f, 15.201f, 3.9372f, 15.5358f, 4.0067f, 15.8879f)
                curveTo(4.037f, 16.0415f, 4.0498f, 16.201f, 4.0752f, 16.5199f)
                lineTo(4.0752f, 16.5199f)
                curveTo(4.1392f, 17.3213f, 4.1712f, 17.722f, 4.2892f, 18.0563f)
                curveTo(4.5623f, 18.8295f, 5.1705f, 19.4377f, 5.9437f, 19.7108f)
                curveTo(6.278f, 19.8288f, 6.6787f, 19.8608f, 7.48f, 19.9248f)
                lineTo(7.4801f, 19.9248f)
                curveTo(7.799f, 19.9502f, 7.9585f, 19.963f, 8.1121f, 19.9933f)
                curveTo(8.4642f, 20.0628f, 8.799f, 20.2015f, 9.0971f, 20.4013f)
                curveTo(9.2271f, 20.4884f, 9.3489f, 20.5922f, 9.5924f, 20.7997f)
                curveTo(10.2043f, 21.3212f, 10.5102f, 21.5819f, 10.8301f, 21.7348f)
                curveTo(11.57f, 22.0884f, 12.43f, 22.0884f, 13.1699f, 21.7348f)
                curveTo(13.4898f, 21.5819f, 13.7957f, 21.3212f, 14.4076f, 20.7997f)
                curveTo(14.6511f, 20.5922f, 14.7729f, 20.4884f, 14.9029f, 20.4013f)
                curveTo(15.201f, 20.2015f, 15.5358f, 20.0628f, 15.8879f, 19.9933f)
                curveTo(16.0415f, 19.963f, 16.201f, 19.9502f, 16.5199f, 19.9248f)
                lineTo(16.52f, 19.9248f)
                curveTo(17.3213f, 19.8608f, 17.722f, 19.8288f, 18.0563f, 19.7108f)
                curveTo(18.8295f, 19.4377f, 19.4377f, 18.8295f, 19.7108f, 18.0563f)
                curveTo(19.8288f, 17.722f, 19.8608f, 17.3213f, 19.9248f, 16.52f)
                lineTo(19.9248f, 16.5199f)
                curveTo(19.9502f, 16.201f, 19.963f, 16.0415f, 19.9933f, 15.8879f)
                curveTo(20.0628f, 15.5358f, 20.2015f, 15.201f, 20.4013f, 14.9029f)
                curveTo(20.4884f, 14.7729f, 20.5922f, 14.6511f, 20.7997f, 14.4076f)
                curveTo(21.3212f, 13.7957f, 21.5819f, 13.4898f, 21.7348f, 13.1699f)
                curveTo(22.0884f, 12.43f, 22.0884f, 11.57f, 21.7348f, 10.8301f)
                curveTo(21.5819f, 10.5102f, 21.3212f, 10.2043f, 20.7997f, 9.5924f)
                curveTo(20.5922f, 9.3489f, 20.4884f, 9.2271f, 20.4013f, 9.0971f)
                curveTo(20.2015f, 8.799f, 20.0628f, 8.4642f, 19.9933f, 8.1121f)
                curveTo(19.963f, 7.9585f, 19.9502f, 7.799f, 19.9248f, 7.4801f)
                lineTo(19.9248f, 7.48f)
                curveTo(19.8608f, 6.6787f, 19.8288f, 6.278f, 19.7108f, 5.9437f)
                curveTo(19.4377f, 5.1705f, 18.8295f, 4.5623f, 18.0563f, 4.2892f)
                curveTo(17.722f, 4.1712f, 17.3213f, 4.1392f, 16.5199f, 4.0752f)
                lineTo(16.5199f, 4.0752f)
                curveTo(16.201f, 4.0498f, 16.0415f, 4.037f, 15.8879f, 4.0067f)
                curveTo(15.5358f, 3.9372f, 15.201f, 3.7985f, 14.9029f, 3.5987f)
                curveTo(14.7729f, 3.5116f, 14.6511f, 3.4078f, 14.4076f, 3.2003f)
                curveTo(13.7957f, 2.6788f, 13.4898f, 2.4181f, 13.1699f, 2.2652f)
                curveTo(12.43f, 1.9116f, 11.57f, 1.9116f, 10.8301f, 2.2652f)
                curveTo(10.5102f, 2.4181f, 10.2043f, 2.6788f, 9.5924f, 3.2003f)
                lineTo(9.5924f, 3.2003f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.3736f, 9.863f)
                curveTo(16.6914f, 9.5451f, 16.6914f, 9.0298f, 16.3736f, 8.712f)
                curveTo(16.0557f, 8.3942f, 15.5404f, 8.3942f, 15.2226f, 8.712f)
                lineTo(10.3723f, 13.5623f)
                lineTo(8.7775f, 11.9674f)
                curveTo(8.4597f, 11.6496f, 7.9444f, 11.6496f, 7.6266f, 11.9674f)
                curveTo(7.3087f, 12.2853f, 7.3087f, 12.8006f, 7.6266f, 13.1184f)
                lineTo(9.7969f, 15.2887f)
                curveTo(10.1147f, 15.6065f, 10.63f, 15.6065f, 10.9478f, 15.2887f)
                lineTo(16.3736f, 9.863f)
                close()
            }
        }
            .build()
        return _verifiedCheck!!
    }

private var _verifiedCheck: ImageVector? = null
