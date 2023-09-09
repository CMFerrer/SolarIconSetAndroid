package com.chiksmedina.solar.broken.school

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
import com.chiksmedina.solar.broken.SchoolGroup

public val SchoolGroup.CaseMinimalistic: ImageVector
    get() {
        if (_caseMinimalistic != null) {
            return _caseMinimalistic!!
        }
        _caseMinimalistic = Builder(name = "CaseMinimalistic", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                curveTo(22.0f, 10.2288f, 22.0f, 8.3432f, 20.8284f, 7.1716f)
                curveTo(20.0781f, 6.4212f, 19.0348f, 6.1514f, 17.3909f, 6.0545f)
                curveTo(16.468f, 6.0f, 15.3559f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(8.6441f, 6.0f, 7.532f, 6.0f, 6.6091f, 6.0545f)
                curveTo(4.9652f, 6.1514f, 3.9219f, 6.4212f, 3.1716f, 7.1716f)
                curveTo(2.0f, 8.3432f, 2.0f, 10.2288f, 2.0f, 14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(21.4816f, 20.1752f, 21.7706f, 19.3001f, 21.8985f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.6094f, 6.0545f)
                curveTo(7.4328f, 6.0336f, 8.1593f, 5.4549f, 8.4394f, 4.6803f)
                curveTo(8.4481f, 4.6565f, 8.4569f, 4.63f, 8.4746f, 4.577f)
                lineTo(8.5002f, 4.5f)
                curveTo(8.5424f, 4.3734f, 8.5635f, 4.3101f, 8.5861f, 4.254f)
                curveTo(8.8743f, 3.5371f, 9.5496f, 3.0504f, 10.3208f, 3.0037f)
                curveTo(10.3812f, 3.0f, 10.4479f, 3.0f, 10.5814f, 3.0f)
                horizontalLineTo(13.4191f)
                curveTo(13.5525f, 3.0f, 13.6192f, 3.0f, 13.6796f, 3.0037f)
                curveTo(14.4508f, 3.0504f, 15.1262f, 3.5371f, 15.4144f, 4.254f)
                curveTo(15.4369f, 4.3101f, 15.458f, 4.3734f, 15.5002f, 4.5f)
                lineTo(15.5259f, 4.577f)
                curveTo(15.5435f, 4.6299f, 15.5524f, 4.6565f, 15.561f, 4.6803f)
                curveTo(15.8412f, 5.4549f, 16.5676f, 6.0336f, 17.3911f, 6.0545f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6618f, 8.7197f)
                curveTo(18.6519f, 10.6761f, 17.147f, 11.6543f, 15.5605f, 12.1472f)
                curveTo(13.2416f, 12.8677f, 10.7586f, 12.8677f, 8.4396f, 12.1472f)
                curveTo(6.8531f, 11.6543f, 5.3482f, 10.6761f, 2.3384f, 8.7197f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                verticalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 11.0f)
                verticalLineTo(13.0f)
            }
        }
        .build()
        return _caseMinimalistic!!
    }

private var _caseMinimalistic: ImageVector? = null
