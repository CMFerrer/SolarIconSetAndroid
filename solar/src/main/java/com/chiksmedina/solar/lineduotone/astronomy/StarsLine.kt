package com.chiksmedina.solar.lineduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.AstronomyGroup

public val AstronomyGroup.StarsLine: ImageVector
    get() {
        if (_starsLine != null) {
            return _starsLine!!
        }
        _starsLine = Builder(name = "StarsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5497f, 3.4395f)
                curveTo(12.118f, 2.509f, 11.9022f, 2.0438f, 11.5213f, 2.0045f)
                curveTo(11.1405f, 1.9652f, 10.8468f, 2.3779f, 10.2595f, 3.2031f)
                lineTo(10.1075f, 3.4167f)
                curveTo(9.9406f, 3.6512f, 9.8572f, 3.7684f, 9.737f, 3.8391f)
                curveTo(9.6168f, 3.9097f, 9.4735f, 3.9258f, 9.1869f, 3.9578f)
                lineTo(8.9261f, 3.9871f)
                curveTo(7.9176f, 4.1f, 7.4134f, 4.1564f, 7.2635f, 4.5078f)
                curveTo(7.1135f, 4.8592f, 7.4172f, 5.2727f, 8.0245f, 6.0999f)
                lineTo(8.1816f, 6.3139f)
                curveTo(8.3542f, 6.549f, 8.4405f, 6.6665f, 8.4718f, 6.8041f)
                curveTo(8.5031f, 6.9417f, 8.4759f, 7.0838f, 8.4214f, 7.368f)
                lineTo(8.3719f, 7.6268f)
                curveTo(8.1803f, 8.627f, 8.0844f, 9.1271f, 8.3727f, 9.3836f)
                curveTo(8.6609f, 9.6401f, 9.1422f, 9.483f, 10.1049f, 9.169f)
                lineTo(10.3539f, 9.0877f)
                curveTo(10.6275f, 8.9985f, 10.7643f, 8.9538f, 10.9038f, 8.9682f)
                curveTo(11.0433f, 8.9826f, 11.1698f, 9.0544f, 11.4227f, 9.198f)
                lineTo(11.653f, 9.3287f)
                curveTo(12.543f, 9.834f, 12.988f, 10.0866f, 13.316f, 9.8937f)
                curveTo(13.6441f, 9.7009f, 13.6379f, 9.1902f, 13.6256f, 8.169f)
                lineTo(13.6224f, 7.9048f)
                curveTo(13.6189f, 7.6146f, 13.6171f, 7.4694f, 13.672f, 7.3407f)
                curveTo(13.727f, 7.212f, 13.8323f, 7.1143f, 14.0431f, 6.9188f)
                lineTo(14.235f, 6.7408f)
                curveTo(14.9767f, 6.0528f, 15.3475f, 5.7089f, 15.262f, 5.3332f)
                curveTo(15.1766f, 4.9576f, 14.6914f, 4.799f, 13.7211f, 4.4819f)
                lineTo(13.4701f, 4.3999f)
                curveTo(13.1943f, 4.3098f, 13.0565f, 4.2647f, 12.9509f, 4.1707f)
                curveTo(12.8453f, 4.0768f, 12.784f, 3.9446f, 12.6613f, 3.6802f)
                lineTo(12.5497f, 3.4395f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9998f, 22.0f)
                curveTo(10.6665f, 19.8333f, 10.1998f, 14.8f, 10.9998f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 22.0f)
                curveTo(14.5f, 18.6667f, 16.0f, 13.0f, 22.0f, 9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.0f, strokeLineCap =
                    Butt, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.2681f)
                curveTo(5.0f, 13.2681f, 5.6496f, 14.0159f, 6.2226f, 14.1694f)
                curveTo(6.7955f, 14.3229f, 7.732f, 14.0001f, 7.732f, 14.0001f)
                curveTo(7.732f, 14.0001f, 6.9842f, 14.6497f, 6.8307f, 15.2227f)
                curveTo(6.6772f, 15.7957f, 7.0f, 16.7322f, 7.0f, 16.7322f)
                curveTo(7.0f, 16.7322f, 6.3504f, 15.9843f, 5.7774f, 15.8308f)
                curveTo(5.2044f, 15.6773f, 4.2679f, 16.0001f, 4.2679f, 16.0001f)
                curveTo(4.2679f, 16.0001f, 5.0158f, 15.3505f, 5.1693f, 14.7775f)
                curveTo(5.3228f, 14.2046f, 5.0f, 13.2681f, 5.0f, 13.2681f)
                close()
            }
        }
        .build()
        return _starsLine!!
    }

private var _starsLine: ImageVector? = null
