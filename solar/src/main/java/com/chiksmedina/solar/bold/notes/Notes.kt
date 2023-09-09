package com.chiksmedina.solar.bold.notes

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
import com.chiksmedina.solar.bold.NotesGroup

public val NotesGroup.Notes: ImageVector
    get() {
        if (_notes != null) {
            return _notes!!
        }
        _notes = Builder(name = "Notes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7546f, 14.716f)
                lineTo(3.2722f, 16.6479f)
                curveTo(3.8765f, 18.9029f, 4.1786f, 20.0305f, 4.8635f, 20.7618f)
                curveTo(5.4043f, 21.3392f, 6.1042f, 21.7433f, 6.8747f, 21.9229f)
                curveTo(7.8504f, 22.1504f, 8.978f, 21.8483f, 11.2331f, 21.244f)
                curveTo(13.4881f, 20.6398f, 14.6157f, 20.3377f, 15.347f, 19.6528f)
                curveTo(15.4077f, 19.5959f, 15.4664f, 19.5373f, 15.5233f, 19.477f)
                curveTo(15.1891f, 19.449f, 14.852f, 19.3952f, 14.5094f, 19.3271f)
                curveTo(13.8133f, 19.1887f, 12.9862f, 18.967f, 12.008f, 18.7049f)
                lineTo(11.9012f, 18.6763f)
                lineTo(11.8764f, 18.6697f)
                curveTo(10.8121f, 18.3845f, 9.9228f, 18.1457f, 9.2128f, 17.8892f)
                curveTo(8.4661f, 17.6195f, 7.7876f, 17.287f, 7.2115f, 16.7474f)
                curveTo(6.4175f, 16.0038f, 5.8619f, 15.0414f, 5.6149f, 13.982f)
                curveTo(5.4357f, 13.2133f, 5.4869f, 12.4594f, 5.6267f, 11.6779f)
                curveTo(5.7606f, 10.929f, 6.0011f, 10.0315f, 6.2893f, 8.9561f)
                lineTo(6.2893f, 8.9561f)
                lineTo(6.8236f, 6.9617f)
                lineTo(6.8425f, 6.8916f)
                curveTo(4.9219f, 7.409f, 3.911f, 7.7151f, 3.2369f, 8.3465f)
                curveTo(2.6595f, 8.8873f, 2.2554f, 9.5871f, 2.0757f, 10.3576f)
                curveTo(1.8482f, 11.3334f, 2.1503f, 12.4609f, 2.7546f, 14.716f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
        }
        .build()
        return _notes!!
    }

private var _notes: ImageVector? = null
