package com.chiksmedina.solar.bold.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.TextFormattingGroup

public val TextFormattingGroup.LinkRoundAngle: ImageVector
    get() {
        if (_linkRoundAngle != null) {
            return _linkRoundAngle!!
        }
        _linkRoundAngle = Builder(name = "LinkRoundAngle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1693f, 6.309f)
                curveTo(8.2467f, 4.2303f, 11.6145f, 4.2303f, 13.6918f, 6.309f)
                curveTo(15.7694f, 8.3878f, 15.7694f, 11.7586f, 13.6918f, 13.8375f)
                lineTo(12.2612f, 15.2689f)
                curveTo(11.9684f, 15.5619f, 11.9686f, 16.0368f, 12.2616f, 16.3296f)
                curveTo(12.5545f, 16.6224f, 13.0294f, 16.6222f, 13.3222f, 16.3292f)
                lineTo(14.7528f, 14.8978f)
                curveTo(17.4157f, 12.2332f, 17.4157f, 7.9132f, 14.7528f, 5.2486f)
                curveTo(12.0896f, 2.5838f, 7.7715f, 2.5838f, 5.1083f, 5.2486f)
                lineTo(2.2472f, 8.1116f)
                curveTo(-0.4157f, 10.7762f, -0.4157f, 15.0961f, 2.2472f, 17.7607f)
                curveTo(3.4818f, 18.9961f, 5.074f, 19.6593f, 6.6901f, 19.7488f)
                curveTo(7.1037f, 19.7718f, 7.4576f, 19.4551f, 7.4805f, 19.0415f)
                curveTo(7.5034f, 18.6279f, 7.1867f, 18.2741f, 6.7732f, 18.2512f)
                curveTo(5.5116f, 18.1812f, 4.2719f, 17.6647f, 3.3082f, 16.7004f)
                curveTo(1.2306f, 14.6215f, 1.2306f, 11.2508f, 3.3082f, 9.1719f)
                lineTo(6.1693f, 6.309f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3099f, 4.2512f)
                curveTo(16.8963f, 4.2282f, 16.5424f, 4.5449f, 16.5195f, 4.9585f)
                curveTo(16.4966f, 5.3721f, 16.8133f, 5.7259f, 17.2268f, 5.7488f)
                curveTo(18.4884f, 5.8188f, 19.7281f, 6.3353f, 20.6918f, 7.2996f)
                curveTo(22.7694f, 9.3785f, 22.7694f, 12.7492f, 20.6918f, 14.8281f)
                lineTo(17.8307f, 17.691f)
                curveTo(15.7533f, 19.7697f, 12.3855f, 19.7697f, 10.3082f, 17.691f)
                curveTo(8.2306f, 15.6122f, 8.2306f, 12.2414f, 10.3082f, 10.1626f)
                lineTo(11.7388f, 8.7311f)
                curveTo(12.0316f, 8.4381f, 12.0314f, 7.9632f, 11.7384f, 7.6704f)
                curveTo(11.4454f, 7.3776f, 10.9706f, 7.3778f, 10.6778f, 7.6708f)
                lineTo(9.2472f, 9.1022f)
                curveTo(6.5843f, 11.7668f, 6.5843f, 16.0868f, 9.2472f, 18.7514f)
                curveTo(11.9104f, 21.4162f, 16.2285f, 21.4162f, 18.8916f, 18.7514f)
                lineTo(21.7528f, 15.8884f)
                curveTo(24.4157f, 13.2238f, 24.4157f, 8.9039f, 21.7528f, 6.2393f)
                curveTo(20.5182f, 5.0039f, 18.926f, 4.3407f, 17.3099f, 4.2512f)
                close()
            }
        }
        .build()
        return _linkRoundAngle!!
    }

private var _linkRoundAngle: ImageVector? = null
