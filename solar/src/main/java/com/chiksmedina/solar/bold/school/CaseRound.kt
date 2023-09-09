package com.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.SchoolGroup

public val SchoolGroup.CaseRound: ImageVector
    get() {
        if (_caseRound != null) {
            return _caseRound!!
        }
        _caseRound = Builder(name = "CaseRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0002f, 2.75f)
                curveTo(11.0217f, 2.75f, 10.1873f, 3.375f, 9.878f, 4.2499f)
                curveTo(9.74f, 4.6405f, 9.3115f, 4.8452f, 8.921f, 4.7071f)
                curveTo(8.5304f, 4.5691f, 8.3257f, 4.1406f, 8.4638f, 3.7501f)
                curveTo(8.9782f, 2.2946f, 10.3662f, 1.25f, 12.0002f, 1.25f)
                curveTo(13.6341f, 1.25f, 15.0222f, 2.2946f, 15.5366f, 3.7501f)
                curveTo(15.6747f, 4.1406f, 15.47f, 4.5691f, 15.0794f, 4.7071f)
                curveTo(14.6889f, 4.8452f, 14.2604f, 4.6405f, 14.1224f, 4.2499f)
                curveTo(13.8131f, 3.375f, 12.9787f, 2.75f, 12.0002f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.5f)
                horizontalLineTo(10.0f)
                curveTo(9.7239f, 12.5f, 9.5f, 12.7239f, 9.5f, 13.0f)
                verticalLineTo(15.1615f)
                curveTo(9.5f, 15.3659f, 9.6245f, 15.5498f, 9.8143f, 15.6257f)
                lineTo(10.5144f, 15.9058f)
                curveTo(11.4681f, 16.2872f, 12.5319f, 16.2872f, 13.4856f, 15.9058f)
                lineTo(14.1857f, 15.6257f)
                curveTo(14.3755f, 15.5498f, 14.5f, 15.3659f, 14.5f, 15.1615f)
                verticalLineTo(13.0f)
                curveTo(14.5f, 12.7239f, 14.2761f, 12.5f, 14.0f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0108f, 15.3691f)
                lineTo(3.0059f, 13.8677f)
                curveTo(3.0359f, 16.9822f, 3.2179f, 19.8505f, 4.3179f, 20.8283f)
                curveTo(5.6359f, 21.9998f, 7.7573f, 21.9998f, 11.9999f, 21.9998f)
                curveTo(16.2425f, 21.9998f, 18.3639f, 21.9998f, 19.6819f, 20.8283f)
                curveTo(20.7819f, 19.8505f, 20.9638f, 16.9822f, 20.9939f, 13.8677f)
                lineTo(15.9892f, 15.3691f)
                curveTo(15.913f, 16.1018f, 15.4372f, 16.7407f, 14.7428f, 17.0184f)
                lineTo(14.0426f, 17.2985f)
                curveTo(12.7314f, 17.823f, 11.2686f, 17.823f, 9.9573f, 17.2985f)
                lineTo(9.2572f, 17.0184f)
                curveTo(8.5628f, 16.7407f, 8.087f, 16.1018f, 8.0108f, 15.3691f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6089f, 5.0f)
                horizontalLineTo(16.3911f)
                curveTo(18.8412f, 5.0f, 20.0663f, 5.0f, 20.8934f, 5.673f)
                curveTo(21.0524f, 5.8023f, 21.1977f, 5.9476f, 21.327f, 6.1066f)
                curveTo(22.0f, 6.9337f, 22.0f, 8.1588f, 22.0f, 10.6089f)
                curveTo(22.0f, 11.2307f, 22.0f, 11.5415f, 21.8492f, 11.784f)
                curveTo(21.8199f, 11.8312f, 21.7866f, 11.8759f, 21.7498f, 11.9176f)
                curveTo(21.5609f, 12.1317f, 21.2631f, 12.2211f, 20.6676f, 12.3997f)
                lineTo(16.0f, 13.8f)
                verticalLineTo(13.0f)
                curveTo(16.0f, 11.8954f, 15.1046f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(10.0f)
                curveTo(8.8954f, 11.0f, 8.0f, 11.8954f, 8.0f, 13.0f)
                verticalLineTo(13.8f)
                lineTo(3.3324f, 12.3997f)
                curveTo(2.7369f, 12.2211f, 2.4392f, 12.1317f, 2.2502f, 11.9176f)
                curveTo(2.2134f, 11.8759f, 2.1802f, 11.8312f, 2.1508f, 11.784f)
                curveTo(2.0f, 11.5415f, 2.0f, 11.2307f, 2.0f, 10.6089f)
                curveTo(2.0f, 8.1588f, 2.0f, 6.9337f, 2.673f, 6.1066f)
                curveTo(2.8023f, 5.9476f, 2.9476f, 5.8023f, 3.1066f, 5.673f)
                curveTo(3.9337f, 5.0f, 5.1588f, 5.0f, 7.6089f, 5.0f)
                close()
            }
        }
        .build()
        return _caseRound!!
    }

private var _caseRound: ImageVector? = null
