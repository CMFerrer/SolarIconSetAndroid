package com.chiksmedina.solar.bold.time

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
import com.chiksmedina.solar.bold.TimeGroup

public val TimeGroup.WatchRound: ImageVector
    get() {
        if (_watchRound != null) {
            return _watchRound!!
        }
        _watchRound = Builder(name = "WatchRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 18.9767f)
                curveTo(15.866f, 18.9767f, 19.0f, 15.8531f, 19.0f, 12.0f)
                curveTo(19.0f, 8.1468f, 15.866f, 5.0233f, 12.0f, 5.0233f)
                curveTo(8.134f, 5.0233f, 5.0f, 8.1468f, 5.0f, 12.0f)
                curveTo(5.0f, 15.8531f, 8.134f, 18.9767f, 12.0f, 18.9767f)
                close()
                moveTo(12.0f, 8.4401f)
                curveTo(12.3866f, 8.4401f, 12.7f, 8.7524f, 12.7f, 9.1377f)
                verticalLineTo(11.703f)
                lineTo(14.3518f, 13.286f)
                curveTo(14.6305f, 13.5531f, 14.6392f, 13.9947f, 14.3712f, 14.2725f)
                curveTo(14.1033f, 14.5502f, 13.6602f, 14.5589f, 13.3815f, 14.2918f)
                lineTo(11.5148f, 12.5029f)
                curveTo(11.3776f, 12.3714f, 11.3f, 12.1898f, 11.3f, 12.0f)
                verticalLineTo(9.1377f)
                curveTo(11.3f, 8.7524f, 11.6134f, 8.4401f, 12.0f, 8.4401f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8585f, 2.0743f)
                curveTo(10.4136f, 2.0f, 11.1129f, 2.0f, 11.9515f, 2.0f)
                horizontalLineTo(12.0485f)
                curveTo(12.8871f, 2.0f, 13.5864f, 2.0f, 14.1415f, 2.0743f)
                curveTo(14.7275f, 2.1528f, 15.2565f, 2.3256f, 15.6816f, 2.7493f)
                curveTo(16.1067f, 3.173f, 16.28f, 3.7002f, 16.3587f, 4.2842f)
                curveTo(16.3832f, 4.4653f, 16.3996f, 4.6618f, 16.4107f, 4.8735f)
                curveTo(15.1287f, 4.0837f, 13.6178f, 3.6279f, 12.0f, 3.6279f)
                curveTo(10.3822f, 3.6279f, 8.8713f, 4.0837f, 7.5893f, 4.8735f)
                curveTo(7.6004f, 4.6618f, 7.6168f, 4.4653f, 7.6413f, 4.2842f)
                curveTo(7.72f, 3.7002f, 7.8933f, 3.173f, 8.3184f, 2.7493f)
                curveTo(8.7435f, 2.3256f, 9.2725f, 2.1528f, 9.8585f, 2.0743f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6816f, 21.2507f)
                curveTo(16.1067f, 20.827f, 16.28f, 20.2998f, 16.3587f, 19.7158f)
                curveTo(16.3832f, 19.5347f, 16.3996f, 19.3382f, 16.4107f, 19.1265f)
                curveTo(15.1287f, 19.9163f, 13.6178f, 20.3721f, 12.0f, 20.3721f)
                curveTo(10.3822f, 20.3721f, 8.8713f, 19.9163f, 7.5893f, 19.1265f)
                curveTo(7.6004f, 19.3382f, 7.6168f, 19.5347f, 7.6413f, 19.7158f)
                curveTo(7.72f, 20.2998f, 7.8933f, 20.827f, 8.3184f, 21.2507f)
                curveTo(8.7435f, 21.6744f, 9.2725f, 21.8471f, 9.8585f, 21.9257f)
                curveTo(10.4136f, 22.0f, 11.1129f, 22.0f, 11.9515f, 22.0f)
                horizontalLineTo(12.0485f)
                curveTo(12.8871f, 22.0f, 13.5864f, 22.0f, 14.1415f, 21.9257f)
                curveTo(14.7275f, 21.8471f, 15.2565f, 21.6744f, 15.6816f, 21.2507f)
                close()
            }
        }
        .build()
        return _watchRound!!
    }

private var _watchRound: ImageVector? = null
