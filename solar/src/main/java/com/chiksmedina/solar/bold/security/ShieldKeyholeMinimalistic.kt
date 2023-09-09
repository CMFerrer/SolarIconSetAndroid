package com.chiksmedina.solar.bold.security

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
import com.chiksmedina.solar.bold.SecurityGroup

public val SecurityGroup.ShieldKeyholeMinimalistic: ImageVector
    get() {
        if (_shieldKeyholeMinimalistic != null) {
            return _shieldKeyholeMinimalistic!!
        }
        _shieldKeyholeMinimalistic = Builder(name = "ShieldKeyholeMinimalistic", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8753f, 8.5521f)
                curveTo(11.3146f, 8.2985f, 11.8017f, 8.2101f, 12.2684f, 8.2666f)
                curveTo(12.9489f, 8.3491f, 13.5804f, 8.7386f, 13.9481f, 9.3755f)
                curveTo(14.3159f, 10.0124f, 14.3374f, 10.754f, 14.0686f, 11.3846f)
                curveTo(13.8842f, 11.817f, 13.5641f, 12.1947f, 13.1248f, 12.4484f)
                curveTo(12.0488f, 13.0695f, 10.6731f, 12.7009f, 10.0519f, 11.625f)
                curveTo(9.4307f, 10.5491f, 9.7993f, 9.1733f, 10.8753f, 8.5521f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.3775f, 5.0824f)
                curveTo(3.0f, 5.6203f, 3.0f, 7.2191f, 3.0f, 10.4167f)
                verticalLineTo(11.9914f)
                curveTo(3.0f, 17.6294f, 7.239f, 20.3655f, 9.8986f, 21.5273f)
                curveTo(10.62f, 21.8424f, 10.9807f, 22.0f, 12.0f, 22.0f)
                curveTo(13.0193f, 22.0f, 13.38f, 21.8424f, 14.1014f, 21.5273f)
                curveTo(16.761f, 20.3655f, 21.0f, 17.6294f, 21.0f, 11.9914f)
                verticalLineTo(10.4167f)
                curveTo(21.0f, 7.2191f, 21.0f, 5.6203f, 20.6225f, 5.0824f)
                curveTo(20.245f, 4.5445f, 18.7417f, 4.03f, 15.7351f, 3.0008f)
                lineTo(15.1623f, 2.8047f)
                curveTo(13.595f, 2.2682f, 12.8114f, 2.0f, 12.0f, 2.0f)
                curveTo(11.1886f, 2.0f, 10.405f, 2.2682f, 8.8377f, 2.8047f)
                lineTo(8.2649f, 3.0008f)
                curveTo(5.2583f, 4.03f, 3.755f, 4.5445f, 3.3775f, 5.0824f)
                close()
                moveTo(12.4489f, 6.7775f)
                curveTo(11.6708f, 6.6832f, 10.8555f, 6.8315f, 10.1253f, 7.2531f)
                curveTo(8.3319f, 8.2885f, 7.7174f, 10.5816f, 8.7528f, 12.375f)
                curveTo(9.3113f, 13.3422f, 10.2356f, 13.9665f, 11.25f, 14.174f)
                verticalLineTo(16.5002f)
                curveTo(11.25f, 16.9145f, 11.5858f, 17.2502f, 12.0f, 17.2502f)
                curveTo(12.4142f, 17.2502f, 12.75f, 16.9145f, 12.75f, 16.5002f)
                verticalLineTo(14.175f)
                curveTo(13.1356f, 14.0963f, 13.5152f, 13.955f, 13.8748f, 13.7474f)
                curveTo(14.605f, 13.3258f, 15.141f, 12.6939f, 15.4484f, 11.9728f)
                curveTo(15.8943f, 10.927f, 15.8608f, 9.6883f, 15.2472f, 8.6255f)
                curveTo(14.6336f, 7.5627f, 13.5776f, 6.9143f, 12.4489f, 6.7775f)
                close()
            }
        }
        .build()
        return _shieldKeyholeMinimalistic!!
    }

private var _shieldKeyholeMinimalistic: ImageVector? = null
