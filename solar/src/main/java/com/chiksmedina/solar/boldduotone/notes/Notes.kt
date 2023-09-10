package com.chiksmedina.solar.boldduotone.notes

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
import com.chiksmedina.solar.boldduotone.NotesGroup

val NotesGroup.Notes: ImageVector
    get() {
        if (_notes != null) {
            return _notes!!
        }
        _notes = Builder(
            name = "Notes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.8293f, 10.7154f)
                lineTo(20.3116f, 12.6473f)
                curveTo(19.7074f, 14.9024f, 19.4052f, 16.0299f, 18.7203f, 16.7612f)
                curveTo(18.1795f, 17.3386f, 17.4796f, 17.7427f, 16.7092f, 17.9223f)
                curveTo(16.6129f, 17.9448f, 16.5152f, 17.9621f, 16.415f, 17.9744f)
                curveTo(15.4999f, 18.0873f, 14.3834f, 17.7881f, 12.3508f, 17.2435f)
                curveTo(10.0957f, 16.6392f, 8.9682f, 16.3371f, 8.2369f, 15.6522f)
                curveTo(7.6595f, 15.1114f, 7.2554f, 14.4115f, 7.0757f, 13.641f)
                curveTo(6.8482f, 12.6652f, 7.1503f, 11.5377f, 7.7546f, 9.2826f)
                lineTo(8.2722f, 7.3508f)
                curveTo(8.3591f, 7.0265f, 8.4398f, 6.7254f, 8.5162f, 6.4456f)
                curveTo(8.9713f, 4.7796f, 9.2771f, 3.863f, 9.8635f, 3.2369f)
                curveTo(10.4043f, 2.6595f, 11.1042f, 2.2554f, 11.8747f, 2.0757f)
                curveTo(12.8504f, 1.8482f, 13.978f, 2.1503f, 16.2331f, 2.7546f)
                curveTo(18.4881f, 3.3588f, 19.6157f, 3.6609f, 20.347f, 4.3459f)
                curveTo(20.9244f, 4.8867f, 21.3285f, 5.5866f, 21.5081f, 6.357f)
                curveTo(21.7356f, 7.3328f, 21.4335f, 8.4603f, 20.8293f, 10.7154f)
                close()
                moveTo(11.0524f, 9.8059f)
                curveTo(11.1596f, 9.4058f, 11.5709f, 9.1684f, 11.971f, 9.2756f)
                lineTo(16.8006f, 10.5697f)
                curveTo(17.2007f, 10.6769f, 17.4381f, 11.0881f, 17.3309f, 11.4882f)
                curveTo(17.2237f, 11.8883f, 16.8125f, 12.1257f, 16.4124f, 12.0185f)
                lineTo(11.5827f, 10.7244f)
                curveTo(11.1826f, 10.6172f, 10.9452f, 10.206f, 11.0524f, 9.8059f)
                close()
                moveTo(10.2756f, 12.7033f)
                curveTo(10.3828f, 12.3032f, 10.794f, 12.0658f, 11.1941f, 12.173f)
                lineTo(14.0919f, 12.9495f)
                curveTo(14.492f, 13.0567f, 14.7294f, 13.4679f, 14.6222f, 13.868f)
                curveTo(14.515f, 14.2681f, 14.1038f, 14.5056f, 13.7037f, 14.3984f)
                lineTo(10.8059f, 13.6219f)
                curveTo(10.4058f, 13.5147f, 10.1683f, 13.1034f, 10.2756f, 12.7033f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.4149f, 17.9745f)
                curveTo(16.2064f, 18.6128f, 15.8398f, 19.1903f, 15.347f, 19.6519f)
                curveTo(14.6157f, 20.3368f, 13.4881f, 20.6389f, 11.2331f, 21.2432f)
                curveTo(8.978f, 21.8474f, 7.8504f, 22.1496f, 6.8747f, 21.922f)
                curveTo(6.1042f, 21.7424f, 5.4043f, 21.3383f, 4.8635f, 20.7609f)
                curveTo(4.1786f, 20.0296f, 3.8765f, 18.9021f, 3.2722f, 16.647f)
                lineTo(2.7546f, 14.7152f)
                curveTo(2.1503f, 12.4601f, 1.8482f, 11.3325f, 2.0757f, 10.3568f)
                curveTo(2.2554f, 9.5863f, 2.6595f, 8.8864f, 3.2369f, 8.3456f)
                curveTo(3.9681f, 7.6607f, 5.0957f, 7.3586f, 7.3508f, 6.7543f)
                curveTo(7.7774f, 6.64f, 8.1637f, 6.5365f, 8.5162f, 6.4453f)
                curveTo(8.5162f, 6.4452f, 8.5162f, 6.4454f, 8.5162f, 6.4453f)
                curveTo(8.4398f, 6.7251f, 8.3591f, 7.0266f, 8.2722f, 7.3508f)
                lineTo(7.7546f, 9.2827f)
                curveTo(7.1503f, 11.5377f, 6.8482f, 12.6653f, 7.0757f, 13.6411f)
                curveTo(7.2554f, 14.4115f, 7.6595f, 15.1114f, 8.2369f, 15.6522f)
                curveTo(8.9682f, 16.3371f, 10.0957f, 16.6393f, 12.3508f, 17.2435f)
                curveTo(14.3833f, 17.7881f, 15.4999f, 18.0873f, 16.4149f, 17.9745f)
                close()
            }
        }
            .build()
        return _notes!!
    }

private var _notes: ImageVector? = null
