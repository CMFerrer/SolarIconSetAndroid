package com.chiksmedina.solar.boldduotone.security

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
import com.chiksmedina.solar.boldduotone.SecurityGroup

val SecurityGroup.ShieldKeyholeMinimalistic: ImageVector
    get() {
        if (_shieldKeyholeMinimalistic != null) {
            return _shieldKeyholeMinimalistic!!
        }
        _shieldKeyholeMinimalistic = Builder(
            name = "ShieldKeyholeMinimalistic", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.1254f, 7.2531f)
                curveTo(10.8556f, 6.8315f, 11.6709f, 6.6832f, 12.4491f, 6.7775f)
                curveTo(13.5777f, 6.9143f, 14.6337f, 7.5627f, 15.2473f, 8.6255f)
                curveTo(15.8609f, 9.6883f, 15.8944f, 10.927f, 15.4485f, 11.9728f)
                curveTo(15.1412f, 12.6939f, 14.6051f, 13.3258f, 13.8749f, 13.7474f)
                curveTo(13.5153f, 13.955f, 13.1357f, 14.0962f, 12.7501f, 14.175f)
                verticalLineTo(16.5002f)
                curveTo(12.7501f, 16.9144f, 12.4143f, 17.2502f, 12.0001f, 17.2502f)
                curveTo(11.5859f, 17.2502f, 11.2501f, 16.9144f, 11.2501f, 16.5002f)
                verticalLineTo(14.174f)
                curveTo(10.2357f, 13.9665f, 9.3114f, 13.3422f, 8.753f, 12.375f)
                curveTo(7.7176f, 10.5816f, 8.332f, 8.2885f, 10.1254f, 7.2531f)
                close()
                moveTo(10.8754f, 8.5521f)
                curveTo(11.3147f, 8.2985f, 11.8018f, 8.2101f, 12.2686f, 8.2666f)
                curveTo(12.949f, 8.3491f, 13.5805f, 8.7386f, 13.9482f, 9.3755f)
                curveTo(14.316f, 10.0124f, 14.3375f, 10.754f, 14.0687f, 11.3846f)
                curveTo(13.8843f, 11.817f, 13.5642f, 12.1947f, 13.1249f, 12.4484f)
                curveTo(12.049f, 13.0695f, 10.6732f, 12.7009f, 10.052f, 11.625f)
                curveTo(9.4308f, 10.5491f, 9.7995f, 9.1733f, 10.8754f, 8.5521f)
                close()
            }
        }
            .build()
        return _shieldKeyholeMinimalistic!!
    }

private var _shieldKeyholeMinimalistic: ImageVector? = null
